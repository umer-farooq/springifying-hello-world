package com.somethinlikecoding.spHelloWorld;

public class StandardOutMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider = null;
    
    public StandardOutMessageRenderer(MessageProvider provider){
    	this.messageProvider = provider;
    }

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"
                            + StandardOutMessageRenderer.class.getName());
        }

        System.out.println(messageProvider.getMessage());
    }

}