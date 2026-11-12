package com.huami.passport.entity;

import com.google.gson.annotations.SerializedName;
import com.huami.watch.companion.sport.pb.PBConfig;
import java.io.Serializable;

/* JADX INFO: loaded from: classes12.dex */
public class OAuthUser implements Serializable {

    @SerializedName("confirmationEmail")
    private String confirmationEmail;

    @SerializedName(PBConfig.KEY_CONFIRMED)
    private boolean confirmed;

    @SerializedName("multipleRegistrations")
    private String multipleRegistrations;

    @SerializedName("name")
    private String name;

    @SerializedName("registration")
    private String registration;

    @SerializedName("sub")
    private String sub;

    public String getConfirmationEmail() {
        return this.confirmationEmail;
    }

    public String getMultipleRegistrations() {
        return this.multipleRegistrations;
    }

    public String getName() {
        return this.name;
    }

    public String getRegistration() {
        return this.registration;
    }

    public String getSub() {
        return this.sub;
    }

    public boolean isConfirmed() {
        return this.confirmed;
    }

    public void setConfirmationEmail(String str) {
        this.confirmationEmail = str;
    }

    public void setConfirmed(boolean z) {
        this.confirmed = z;
    }

    public void setMultipleRegistrations(String str) {
        this.multipleRegistrations = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setRegistration(String str) {
        this.registration = str;
    }

    public void setSub(String str) {
        this.sub = str;
    }

    public String toString() {
        return "OAuthUser{sub='" + this.sub + "', name='" + this.name + "', registration='" + this.registration + "', confirmed='" + this.confirmed + "', multipleRegistrations='" + this.multipleRegistrations + "', confirmationEmail='" + this.confirmationEmail + "'}";
    }
}
