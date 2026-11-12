package com.twitter.sdk.android.core.models;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class UserBuilder {
    private String A;
    private String B;
    private String C;
    private String D;
    private boolean E;
    private boolean F;
    private String G;
    private boolean H;
    private Tweet I;
    private int J;
    private String K;
    private String L;
    private int M;
    private boolean N;
    private List<String> O;
    private String P;
    private boolean a;
    private String b;
    private boolean c;
    private boolean d;
    private String e;
    private String f;
    private UserEntities g;
    private int h;
    private boolean i;
    private int j;
    private int k;
    private boolean l;
    private long m = -1;
    private String n;
    private boolean o;
    private String p;
    private int q;
    private String r;
    private String s;
    private String t;
    private String u;
    private String v;
    private boolean w;
    private String x;
    private String y;
    private String z;

    public User build() {
        return new User(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, this.N, this.O, this.P);
    }

    public UserBuilder setContributorsEnabled(boolean z) {
        this.a = z;
        return this;
    }

    public UserBuilder setCreatedAt(String str) {
        this.b = str;
        return this;
    }

    public UserBuilder setDefaultProfile(boolean z) {
        this.c = z;
        return this;
    }

    public UserBuilder setDefaultProfileImage(boolean z) {
        this.d = z;
        return this;
    }

    public UserBuilder setDescription(String str) {
        this.e = str;
        return this;
    }

    public UserBuilder setEmail(String str) {
        this.f = str;
        return this;
    }

    public UserBuilder setEntities(UserEntities userEntities) {
        this.g = userEntities;
        return this;
    }

    public UserBuilder setFavouritesCount(int i) {
        this.h = i;
        return this;
    }

    public UserBuilder setFollowRequestSent(boolean z) {
        this.i = z;
        return this;
    }

    public UserBuilder setFollowersCount(int i) {
        this.j = i;
        return this;
    }

    public UserBuilder setFriendsCount(int i) {
        this.k = i;
        return this;
    }

    public UserBuilder setGeoEnabled(boolean z) {
        this.l = z;
        return this;
    }

    public UserBuilder setId(long j) {
        this.m = j;
        return this;
    }

    public UserBuilder setIdStr(String str) {
        this.n = str;
        return this;
    }

    public UserBuilder setIsTranslator(boolean z) {
        this.o = z;
        return this;
    }

    public UserBuilder setLang(String str) {
        this.p = str;
        return this;
    }

    public UserBuilder setListedCount(int i) {
        this.q = i;
        return this;
    }

    public UserBuilder setLocation(String str) {
        this.r = str;
        return this;
    }

    public UserBuilder setName(String str) {
        this.s = str;
        return this;
    }

    public UserBuilder setProfileBackgroundColor(String str) {
        this.t = str;
        return this;
    }

    public UserBuilder setProfileBackgroundImageUrl(String str) {
        this.u = str;
        return this;
    }

    public UserBuilder setProfileBackgroundImageUrlHttps(String str) {
        this.v = str;
        return this;
    }

    public UserBuilder setProfileBackgroundTile(boolean z) {
        this.w = z;
        return this;
    }

    public UserBuilder setProfileBannerUrl(String str) {
        this.x = str;
        return this;
    }

    public UserBuilder setProfileImageUrl(String str) {
        this.y = str;
        return this;
    }

    public UserBuilder setProfileImageUrlHttps(String str) {
        this.z = str;
        return this;
    }

    public UserBuilder setProfileLinkColor(String str) {
        this.A = str;
        return this;
    }

    public UserBuilder setProfileSidebarBorderColor(String str) {
        this.B = str;
        return this;
    }

    public UserBuilder setProfileSidebarFillColor(String str) {
        this.C = str;
        return this;
    }

    public UserBuilder setProfileTextColor(String str) {
        this.D = str;
        return this;
    }

    public UserBuilder setProfileUseBackgroundImage(boolean z) {
        this.E = z;
        return this;
    }

    public UserBuilder setProtectedUser(boolean z) {
        this.F = z;
        return this;
    }

    public UserBuilder setScreenName(String str) {
        this.G = str;
        return this;
    }

    public UserBuilder setShowAllInlineMedia(boolean z) {
        this.H = z;
        return this;
    }

    public UserBuilder setStatus(Tweet tweet) {
        this.I = tweet;
        return this;
    }

    public UserBuilder setStatusesCount(int i) {
        this.J = i;
        return this;
    }

    public UserBuilder setTimeZone(String str) {
        this.K = str;
        return this;
    }

    public UserBuilder setUrl(String str) {
        this.L = str;
        return this;
    }

    public UserBuilder setUtcOffset(int i) {
        this.M = i;
        return this;
    }

    public UserBuilder setVerified(boolean z) {
        this.N = z;
        return this;
    }

    public UserBuilder setWithheldInCountries(List<String> list) {
        this.O = list;
        return this;
    }

    public UserBuilder setWithheldScope(String str) {
        this.P = str;
        return this;
    }
}
