package com.bridgeit.ipl.service;

import java.util.List;

import com.bridgeit.ipl.model.Player;

public interface PlayerService {

	void addPlayer(Player player);

	Player getPlayerDetails(Long playerId);

	List<Player> displayAllPlayer(int teamId);
	
	List<Player> displayAllPlayer();

	Player getPlayer(String playerName);

	List<Player> getPlayerList(String[] player);

	int viewUpdate(int view, Long playerId);

	List<Player> getDreamPlayerList(int dreamId);
}
