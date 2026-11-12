package jb0;

import ch.qos.logback.core.joran.action.Action;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import u4.d;
import v62.m6;
import v62.p9;
import v62.w3;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'c' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Ljb0/b;", "", "", Action.KEY_ATTRIBUTE, "", "nameRes", "Lu4/d;", "imageVector", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILu4/d;)V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f98103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f98104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f98105e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ b[] f98106f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f98108b;

    static {
        s62.a.f157643a.getClass();
        t62.b bVar = t62.b.f162798a;
        b bVar2 = new b("AVATAR", 0, "avatar", R.string.edit_profile_avatar_title, p9.a(bVar));
        f98103c = bVar2;
        b bVar3 = new b("CAMERA", 1, "camera", R.string.btn_profile_source_camera, m6.a(bVar));
        f98104d = bVar3;
        b bVar4 = new b("GALLERY", 2, "gallery", R.string.btn_profile_source_gallery, w3.a(bVar));
        f98105e = bVar4;
        f98106f = new b[]{bVar2, bVar3, bVar4};
        new a(null);
    }

    private b(String str, int i14, String str2, int i15, d dVar) {
        super(str, i14);
        this.f98107a = i15;
        this.f98108b = dVar;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f98106f.clone();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljb0/b$a;", "", "<init>", "()V", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
