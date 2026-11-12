package e73;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public StringBuilder f63409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f63410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f63411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f63412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public StringBuilder f63413h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f63406a = b.START_DEFINITION;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StringBuilder f63407b = new StringBuilder();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f63408c = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f63414i = false;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63415a;

        static {
            int[] iArr = new int[b.values().length];
            f63415a = iArr;
            try {
                iArr[b.PARAGRAPH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63415a[b.START_DEFINITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63415a[b.LABEL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63415a[b.DESTINATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f63415a[b.START_TITLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f63415a[b.TITLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        START_DEFINITION,
        LABEL,
        DESTINATION,
        START_TITLE,
        TITLE,
        PARAGRAPH
    }

    public final void a() {
        if (this.f63414i) {
            String strA = g73.a.a(this.f63411f);
            StringBuilder sb3 = this.f63413h;
            this.f63408c.add(new h73.o(this.f63410e, strA, sb3 != null ? g73.a.a(sb3.toString()) : null));
            this.f63409d = null;
            this.f63414i = false;
            this.f63410e = null;
            this.f63411f = null;
            this.f63413h = null;
        }
    }
}
