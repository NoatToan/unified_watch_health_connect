package com.twitter.sdk.android.core.models;

import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class TweetBuilder {
    private String A;
    private List<Integer> B;
    private boolean C;
    private User D;
    private boolean E;
    private List<String> F;
    private String G;
    private Card H;
    private Coordinates a;
    private String b;
    private Object c;
    private TweetEntities d;
    private TweetEntities e;
    private Integer f;
    private boolean g;
    private String h;
    private long i = -1;
    private String j;
    private String k;
    private long l;
    private String m;
    private long n;
    private String o;
    private String p;
    private Place q;
    private boolean r;
    private Object s;
    private long t;
    private String u;
    private Tweet v;
    private int w;
    private boolean x;
    private Tweet y;
    private String z;

    public Tweet build() {
        return new Tweet(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
    }

    public TweetBuilder copy(Tweet tweet) {
        this.a = tweet.coordinates;
        this.b = tweet.createdAt;
        this.c = tweet.currentUserRetweet;
        this.d = tweet.entities;
        this.e = tweet.extendedEntities;
        this.f = tweet.favoriteCount;
        this.g = tweet.favorited;
        this.h = tweet.filterLevel;
        this.i = tweet.id;
        this.j = tweet.idStr;
        this.k = tweet.inReplyToScreenName;
        this.l = tweet.inReplyToStatusId;
        String str = tweet.inReplyToStatusIdStr;
        this.m = str;
        this.n = tweet.inReplyToUserId;
        this.o = str;
        this.p = tweet.lang;
        this.q = tweet.place;
        this.r = tweet.possiblySensitive;
        this.s = tweet.scopes;
        this.t = tweet.quotedStatusId;
        this.u = tweet.quotedStatusIdStr;
        this.v = tweet.quotedStatus;
        this.w = tweet.retweetCount;
        this.x = tweet.retweeted;
        this.y = tweet.retweetedStatus;
        this.z = tweet.source;
        this.A = tweet.text;
        this.B = tweet.displayTextRange;
        this.C = tweet.truncated;
        this.D = tweet.user;
        this.E = tweet.withheldCopyright;
        this.F = tweet.withheldInCountries;
        this.G = tweet.withheldScope;
        this.H = tweet.card;
        return this;
    }

    public TweetBuilder setCard(Card card) {
        this.H = card;
        return this;
    }

    public TweetBuilder setCoordinates(Coordinates coordinates) {
        this.a = coordinates;
        return this;
    }

    public TweetBuilder setCreatedAt(String str) {
        this.b = str;
        return this;
    }

    public TweetBuilder setCurrentUserRetweet(Object obj) {
        this.c = obj;
        return this;
    }

    public TweetBuilder setDisplayTextRange(List<Integer> list) {
        this.B = list;
        return this;
    }

    public TweetBuilder setEntities(TweetEntities tweetEntities) {
        this.d = tweetEntities;
        return this;
    }

    public TweetBuilder setExtendedEntities(TweetEntities tweetEntities) {
        this.e = tweetEntities;
        return this;
    }

    public TweetBuilder setFavoriteCount(Integer num) {
        this.f = num;
        return this;
    }

    public TweetBuilder setFavorited(boolean z) {
        this.g = z;
        return this;
    }

    public TweetBuilder setFilterLevel(String str) {
        this.h = str;
        return this;
    }

    public TweetBuilder setId(long j) {
        this.i = j;
        return this;
    }

    public TweetBuilder setIdStr(String str) {
        this.j = str;
        return this;
    }

    public TweetBuilder setInReplyToScreenName(String str) {
        this.k = str;
        return this;
    }

    public TweetBuilder setInReplyToStatusId(long j) {
        this.l = j;
        return this;
    }

    public TweetBuilder setInReplyToStatusIdStr(String str) {
        this.m = str;
        return this;
    }

    public TweetBuilder setInReplyToUserId(long j) {
        this.n = j;
        return this;
    }

    public TweetBuilder setInReplyToUserIdStr(String str) {
        this.o = str;
        return this;
    }

    public TweetBuilder setLang(String str) {
        this.p = str;
        return this;
    }

    public TweetBuilder setPlace(Place place) {
        this.q = place;
        return this;
    }

    public TweetBuilder setPossiblySensitive(boolean z) {
        this.r = z;
        return this;
    }

    public TweetBuilder setQuotedStatus(Tweet tweet) {
        this.v = tweet;
        return this;
    }

    public TweetBuilder setQuotedStatusId(long j) {
        this.t = j;
        return this;
    }

    public TweetBuilder setQuotedStatusIdStr(String str) {
        this.u = str;
        return this;
    }

    public TweetBuilder setRetweetCount(int i) {
        this.w = i;
        return this;
    }

    public TweetBuilder setRetweeted(boolean z) {
        this.x = z;
        return this;
    }

    public TweetBuilder setRetweetedStatus(Tweet tweet) {
        this.y = tweet;
        return this;
    }

    public TweetBuilder setScopes(Object obj) {
        this.s = obj;
        return this;
    }

    public TweetBuilder setSource(String str) {
        this.z = str;
        return this;
    }

    public TweetBuilder setText(String str) {
        this.A = str;
        return this;
    }

    public TweetBuilder setTruncated(boolean z) {
        this.C = z;
        return this;
    }

    public TweetBuilder setUser(User user) {
        this.D = user;
        return this;
    }

    public TweetBuilder setWithheldCopyright(boolean z) {
        this.E = z;
        return this;
    }

    public TweetBuilder setWithheldInCountries(List<String> list) {
        this.F = list;
        return this;
    }

    public TweetBuilder setWithheldScope(String str) {
        this.G = str;
        return this;
    }
}
