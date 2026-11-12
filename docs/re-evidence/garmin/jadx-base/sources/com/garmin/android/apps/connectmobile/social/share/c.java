package com.garmin.android.apps.connectmobile.social.share;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.x;
import ro1.g;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u001f\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/c;", "", "", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "", "Lro1/g;", "appPackagePriorityList", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f44647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f44648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ c[] f44649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ w13.c f44650f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<g> f44652b;

    /* JADX INFO: Fake field, exist only in values array */
    c EF0;

    static {
        g gVar = g.INSTAGRAM;
        g gVar2 = g.FACEBOOK;
        g gVar3 = g.LINE;
        c cVar = new c("JP", 0, "jp", x.k(gVar, gVar2, gVar3));
        g gVar4 = g.WECHAT;
        c cVar2 = new c("CN", 1, "cn", x.k(gVar4, g.QQ_FRIEND, g.WEIBO, g.QQ_ZONE));
        c cVar3 = new c("KR", 2, "kr", x.k(gVar, g.KAKAO_TALK, g.KAKAO_STORY, g.NAVER_BLOG, g.NAVER_BAND));
        g gVar5 = g.WHATSAPP;
        c cVar4 = new c("SG", 3, "sg", x.k(gVar, gVar2, gVar5));
        c cVar5 = new c("MY", 4, "my", x.k(gVar, gVar2, gVar5));
        c cVar6 = new c("TH", 5, "th", x.k(gVar2, gVar, gVar3));
        c cVar7 = new c("ID", 6, TtmlNode.ATTR_ID, x.k(gVar, gVar2));
        g gVar6 = g.MESSENGER;
        c cVar8 = new c("PH", 7, "ph", x.k(gVar2, gVar6, gVar));
        c cVar9 = new c("VN", 8, "vn", x.k(gVar2, gVar6, g.ZALO));
        c cVar10 = new c("IN", 9, "in", x.k(gVar, gVar2));
        c cVar11 = new c("TW", 10, "tw", x.k(gVar2, gVar, gVar3));
        c cVar12 = new c("OTHERS", 11, "others", x.k(gVar2, gVar4));
        f44648d = cVar12;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, cVar8, cVar9, cVar10, cVar11, cVar12};
        f44649e = cVarArr;
        f44650f = new w13.c(cVarArr);
        f44647c = new a(null);
    }

    private c(String str, int i14, String str2, List list) {
        super(str, i14);
        this.f44651a = str2;
        this.f44652b = list;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f44649e.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/c$a;", "", "<init>", "()V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
