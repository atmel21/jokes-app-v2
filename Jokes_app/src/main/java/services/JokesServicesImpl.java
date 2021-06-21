package services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServicesImpl implements JokesService {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	public  JokesServicesImpl() {
		this.chuckNorrisQuotes= new ChuckNorrisQuotes();
	}
	
	@Override
	public String getJokes() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}

}
