package debr.myBatis.model;

public class Player {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLAYER.ID
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLAYER.FIRSTNAME
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    private String firstname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLAYER.LASTNAME
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    private String lastname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column PUBLIC.PLAYER.SPONSOR_ID
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    private Integer sponsorId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLAYER.ID
     *
     * @return the value of PUBLIC.PLAYER.ID
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLAYER.ID
     *
     * @param id the value for PUBLIC.PLAYER.ID
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLAYER.FIRSTNAME
     *
     * @return the value of PUBLIC.PLAYER.FIRSTNAME
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLAYER.FIRSTNAME
     *
     * @param firstname the value for PUBLIC.PLAYER.FIRSTNAME
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLAYER.LASTNAME
     *
     * @return the value of PUBLIC.PLAYER.LASTNAME
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLAYER.LASTNAME
     *
     * @param lastname the value for PUBLIC.PLAYER.LASTNAME
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column PUBLIC.PLAYER.SPONSOR_ID
     *
     * @return the value of PUBLIC.PLAYER.SPONSOR_ID
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public Integer getSponsorId() {
        return sponsorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column PUBLIC.PLAYER.SPONSOR_ID
     *
     * @param sponsorId the value for PUBLIC.PLAYER.SPONSOR_ID
     *
     * @mbg.generated Tue Mar 03 23:19:34 EET 2020
     */
    public void setSponsorId(Integer sponsorId) {
        this.sponsorId = sponsorId;
    }
}