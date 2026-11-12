package com.garmin.android.apps.connectmobile.training.atp.biz;

import com.google.gson.annotations.SerializedName;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001:\u0005\u0007\b\t\n\u000bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/c;", "", "", "articleId", "json", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", JWKParameterNames.RSA_EXPONENT, "b", "c", "a", "d", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45125b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$a;", "", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$d;", "fields", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$d;)V", "a", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$d;", "()Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$d;", "setFields", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("fields")
        private d fields;

        public a(d dVar) {
            this.fields = dVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d getFields() {
            return this.fields;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$b;", "", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$c;", "articles", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$c;)V", "a", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$c;", "()Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$c;", "setArticles", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("Articles")
        private C0865c articles;

        public b(C0865c c0865c) {
            this.articles = c0865c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final C0865c getArticles() {
            return this.articles;
        }
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.training.atp.biz.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R*\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$c;", "", "", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$a;", "articleItems", "<init>", "(Ljava/util/List;)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "setArticleItems", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C0865c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("articleItems")
        private List<a> articleItems;

        public C0865c(List<a> list) {
            this.articleItems = list;
        }

        public final List<a> a() {
            return this.articleItems;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\f\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0015\u0010\u0010R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0016\u0010\u0010R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\f\u001a\u0004\b\u000b\u0010\u000e\"\u0004\b\u0019\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$d;", "", "", "title", "navBarTitle", "deck", "imageUrl", "paragraph", "articleDuration", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "b", "d", "setNavBarTitle", "c", "setDeck", "setImageUrl", JWKParameterNames.RSA_EXPONENT, "setParagraph", "setArticleDuration", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("title")
        private String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @SerializedName("navBarTitle")
        private String navBarTitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @SerializedName("deck")
        private String deck;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @SerializedName("imageUrl")
        private String imageUrl;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @SerializedName("paragraph")
        private String paragraph;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        @SerializedName("articleDuration")
        private String articleDuration;

        public d(String str, String str2, String str3, String str4, String str5, String str6) {
            this.title = str;
            this.navBarTitle = str2;
            this.deck = str3;
            this.imageUrl = str4;
            this.paragraph = str5;
            this.articleDuration = str6;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getArticleDuration() {
            return this.articleDuration;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDeck() {
            return this.deck;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getImageUrl() {
            return this.imageUrl;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getNavBarTitle() {
            return this.navBarTitle;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getParagraph() {
            return this.paragraph;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getTitle() {
            return this.title;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$e;", "", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$b;", "data", "<init>", "(Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$b;)V", "a", "Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$b;", "()Lcom/garmin/android/apps/connectmobile/training/atp/biz/c$b;", "setData", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @SerializedName("data")
        private b data;

        public e(b bVar) {
            this.data = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b getData() {
            return this.data;
        }
    }

    public c(String str, String str2) {
        str.getClass();
        this.f45124a = str;
        this.f45125b = str2;
    }

    public final fu1.h a() {
        b data;
        C0865c articles;
        e eVar = (e) new iu1.g().b(e.class, this.f45125b);
        List<a> listA = (eVar == null || (data = eVar.getData()) == null || (articles = data.getArticles()) == null) ? null : articles.a();
        if (listA == null || listA.isEmpty()) {
            return null;
        }
        fu1.h hVar = new fu1.h(null, null, null, null, null, null, null, null, 255, null);
        hVar.f73517a = this.f45124a;
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            d fields = ((a) it.next()).getFields();
            if (fields != null) {
                if (fields.getTitle() != null) {
                    hVar.f73518b = fields.getTitle();
                } else if (fields.getDeck() != null) {
                    hVar.f73520d = fields.getDeck();
                } else if (fields.getImageUrl() != null) {
                    hVar.f73523g = fields.getImageUrl();
                } else if (fields.getParagraph() != null) {
                    hVar.f73524h = fields.getParagraph();
                } else if (fields.getArticleDuration() != null) {
                    hVar.f73521e = fields.getArticleDuration();
                } else if (fields.getNavBarTitle() != null) {
                    hVar.f73522f = fields.getNavBarTitle();
                }
            }
        }
        return hVar;
    }
}
