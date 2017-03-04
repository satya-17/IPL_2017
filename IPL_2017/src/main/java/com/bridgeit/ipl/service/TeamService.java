package com.bridgeit.ipl.service;

import java.util.List;

import com.bridgeit.ipl.model.Team;

public interface TeamService {

	void addTeam(Team team);

	List<Team> displayAllTeam();

	List<Team> displayTeamInfo(String name);

}