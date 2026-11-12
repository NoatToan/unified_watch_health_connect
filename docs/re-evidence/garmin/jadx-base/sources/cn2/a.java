package cn2;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import hb2.g;
import o13.e;
import org.apache.commons.codec.language.bm.Rule;
import p005kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'b' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes11.dex */
@e
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn2/a;", "", "", RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "shared-device-management_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f28064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f28065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f28066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f28067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a[] f28068f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28069a;

    static {
        String str = g.a.GARMIN_CONNECT_MOBILE.f82804a;
        str.getClass();
        a aVar = new a("GCM", 0, str);
        f28064b = aVar;
        String str2 = g.a.GARMIN_GOLF.f82804a;
        str2.getClass();
        a aVar2 = new a("GOLF", 1, str2);
        f28065c = aVar2;
        String str3 = g.a.GARMIN_DIVE.f82804a;
        str3.getClass();
        a aVar3 = new a("DIVE", 2, str3);
        f28066d = aVar3;
        String str4 = g.a.GARMIN_EXPLORE.f82804a;
        str4.getClass();
        a aVar4 = new a("EXPLORE", 3, str4);
        String str5 = g.a.GARMIN_CONNECT_IQ.f82804a;
        str5.getClass();
        a aVar5 = new a("CONNECT_IQ", 4, str5);
        a aVar6 = new a("SAMPLE", 5, "com.garmin.coresample");
        a aVar7 = new a("SAMPLE_CLONE", 6, "com.garmin.coresample.clone");
        a aVar8 = new a(Rule.ALL, 7, "");
        f28067e = aVar8;
        f28068f = new a[]{aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8};
    }

    private a(String str, int i14, String str2) {
        super(str, i14);
        this.f28069a = str2;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f28068f.clone();
    }
}
