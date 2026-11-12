package z0;

import android.util.Size;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f200708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f200709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i f200710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i f200711d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final i f200712e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i f200713f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i f200714g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final HashSet f200715h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List<u> f200716i;

    @AutoValue
    public static abstract class b extends u {
        public b() {
            super();
        }

        public abstract int a();

        public abstract String b();

        public abstract List<Size> c();

        public abstract int d();
    }

    static {
        i iVar = new i(4, 2002, "SD", Collections.unmodifiableList(Arrays.asList(new Size(720, 480), new Size(640, 480))));
        f200708a = iVar;
        i iVar2 = new i(5, 2003, "HD", Collections.singletonList(new Size(1280, 720)));
        f200709b = iVar2;
        i iVar3 = new i(6, 2004, "FHD", Collections.singletonList(new Size(1920, 1080)));
        f200710c = iVar3;
        i iVar4 = new i(8, 2005, "UHD", Collections.singletonList(new Size(3840, 2160)));
        f200711d = iVar4;
        List list = Collections.EMPTY_LIST;
        i iVar5 = new i(0, 2000, "LOWEST", list);
        f200712e = iVar5;
        i iVar6 = new i(1, 2001, "HIGHEST", list);
        f200713f = iVar6;
        f200714g = new i(-1, -1, "NONE", list);
        f200715h = new HashSet(Arrays.asList(iVar5, iVar6, iVar, iVar2, iVar3, iVar4));
        f200716i = Arrays.asList(iVar4, iVar3, iVar2, iVar);
    }

    private u() {
    }
}
