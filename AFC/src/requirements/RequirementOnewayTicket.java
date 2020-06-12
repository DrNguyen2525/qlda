package requirements;

import java.sql.SQLException;

import certificate.OnewayTicket;
import certificate.TicketDBGateway;
import history.HistoryDBGateway;
import interactor.RequirementInterface;

public class RequirementOnewayTicket implements RequirementInterface{

	private TicketDBGateway ticketGW;
	private HistoryDBGateway historyGW;
	//	this one left me wondering... shouldn't I specify this initiator already here, the book said that I mustn't do that
	public RequirementOnewayTicket(TicketDBGateway ticketMapper, HistoryDBGateway historyMapper) {
		this.ticketGW = ticketMapper;
		this.historyGW = historyMapper;
	}
	
	@Override
	public String passEntering(String certificateId) throws ClassNotFoundException, SQLException {
		return null;
	}

	@Override
	public String passExiting(String certificateId, double fee) throws ClassNotFoundException, SQLException {
		return null;
	}
}