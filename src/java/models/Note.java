package models;

import java.io.Serializable;

/**
 *`
 * @author 794471
 * 
 * Alt + Insert to generate in NetBeans
 * 
 */
public class Note implements Serializable
{
    private String title;
    private String content;
    
    public Note()
    {
        
    }

    public Note(String title, String content) 
    {
        this.title = title;
        this.content = content;
    }

    public String getTitle() 
    {
        return title;
    }

    public String getContent() 
    {
        return content;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public void setContent(String content) 
    {
        this.content = content;
    }
}
