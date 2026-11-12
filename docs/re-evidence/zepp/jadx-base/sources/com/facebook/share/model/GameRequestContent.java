package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class GameRequestContent implements ShareModel {
    public static final Parcelable.Creator<GameRequestContent> CREATOR = new a();
    private final String a;
    private final String b;
    private final List<String> c;
    private final String d;
    private final String e;
    private final ActionType f;
    private final String g;
    private final Filters h;
    private final List<String> i;

    public enum ActionType {
        SEND,
        ASKFOR,
        TURN,
        INVITE
    }

    public static class Builder implements ShareModelBuilder<GameRequestContent, Builder> {
        private String a;
        private String b;
        private List<String> c;
        private String d;
        private String e;
        private ActionType f;
        private String g;
        private Filters h;
        private List<String> i;

        public Builder j(Parcel parcel) {
            return readFrom((GameRequestContent) parcel.readParcelable(GameRequestContent.class.getClassLoader()));
        }

        public Builder setActionType(ActionType actionType) {
            this.f = actionType;
            return this;
        }

        public Builder setCta(String str) {
            this.b = str;
            return this;
        }

        public Builder setData(String str) {
            this.d = str;
            return this;
        }

        public Builder setFilters(Filters filters) {
            this.h = filters;
            return this;
        }

        public Builder setMessage(String str) {
            this.a = str;
            return this;
        }

        public Builder setObjectId(String str) {
            this.g = str;
            return this;
        }

        public Builder setRecipients(List<String> list) {
            this.c = list;
            return this;
        }

        public Builder setSuggestions(List<String> list) {
            this.i = list;
            return this;
        }

        public Builder setTitle(String str) {
            this.e = str;
            return this;
        }

        public Builder setTo(String str) {
            if (str != null) {
                this.c = Arrays.asList(str.split(","));
            }
            return this;
        }

        @Override // com.facebook.share.ShareBuilder
        public GameRequestContent build() {
            return new GameRequestContent(this, null);
        }

        @Override // com.facebook.share.model.ShareModelBuilder
        public Builder readFrom(GameRequestContent gameRequestContent) {
            return gameRequestContent == null ? this : setMessage(gameRequestContent.getMessage()).setCta(gameRequestContent.getCta()).setRecipients(gameRequestContent.getRecipients()).setTitle(gameRequestContent.getTitle()).setData(gameRequestContent.getData()).setActionType(gameRequestContent.getActionType()).setObjectId(gameRequestContent.getObjectId()).setFilters(gameRequestContent.getFilters()).setSuggestions(gameRequestContent.getSuggestions());
        }
    }

    public enum Filters {
        APP_USERS,
        APP_NON_USERS,
        EVERYBODY
    }

    public static class a implements Parcelable.Creator<GameRequestContent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public GameRequestContent createFromParcel(Parcel parcel) {
            return new GameRequestContent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public GameRequestContent[] newArray(int i) {
            return new GameRequestContent[i];
        }
    }

    public /* synthetic */ GameRequestContent(Builder builder, a aVar) {
        this(builder);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ActionType getActionType() {
        return this.f;
    }

    public String getCta() {
        return this.b;
    }

    public String getData() {
        return this.e;
    }

    public Filters getFilters() {
        return this.h;
    }

    public String getMessage() {
        return this.a;
    }

    public String getObjectId() {
        return this.g;
    }

    public List<String> getRecipients() {
        return this.c;
    }

    public List<String> getSuggestions() {
        return this.i;
    }

    public String getTitle() {
        return this.d;
    }

    public String getTo() {
        if (getRecipients() != null) {
            return TextUtils.join(",", getRecipients());
        }
        return null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeStringList(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeString(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeStringList(this.i);
    }

    private GameRequestContent(Builder builder) {
        this.a = builder.a;
        this.b = builder.b;
        this.c = builder.c;
        this.d = builder.e;
        this.e = builder.d;
        this.f = builder.f;
        this.g = builder.g;
        this.h = builder.h;
        this.i = builder.i;
    }

    public GameRequestContent(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.createStringArrayList();
        this.d = parcel.readString();
        this.e = parcel.readString();
        this.f = (ActionType) parcel.readSerializable();
        this.g = parcel.readString();
        this.h = (Filters) parcel.readSerializable();
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        this.i = arrayListCreateStringArrayList;
        parcel.readStringList(arrayListCreateStringArrayList);
    }
}
