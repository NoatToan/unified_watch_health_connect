package defpackage;

import io.sentry.vendor.gson.stream.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@ApiStatus.Internal
public final class htd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<c> f20428a = new ArrayList<>();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f20429a;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f20429a = iArr;
            try {
                iArr[JsonToken.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20429a[JsonToken.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20429a[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f20429a[JsonToken.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f20429a[JsonToken.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f20429a[JsonToken.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f20429a[JsonToken.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f20429a[JsonToken.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f20429a[JsonToken.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f20429a[JsonToken.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public interface b {
        @Nullable
        Object a() throws IOException;
    }

    public interface c {
        @NotNull
        Object getValue();
    }

    public static final class f implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f20432a;

        public f(@NotNull String str) {
            this.f20432a = str;
        }

        @Override // htd.c
        @NotNull
        public Object getValue() {
            return this.f20432a;
        }
    }

    public static final class g implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20433a;

        public g(@NotNull Object obj) {
            this.f20433a = obj;
        }

        @Override // htd.c
        @NotNull
        public Object getValue() {
            return this.f20433a;
        }
    }

    public static /* synthetic */ Object l(jtd jtdVar) throws IOException {
        return Boolean.valueOf(jtdVar.d());
    }

    public static /* synthetic */ Object m() throws IOException {
        return null;
    }

    @Nullable
    public Object e(@NotNull jtd jtdVar) throws IOException {
        o(jtdVar);
        c cVarF = f();
        if (cVarF != null) {
            return cVarF.getValue();
        }
        return null;
    }

    @Nullable
    public final c f() {
        if (this.f20428a.isEmpty()) {
            return null;
        }
        ArrayList<c> arrayList = this.f20428a;
        return arrayList.get(arrayList.size() - 1);
    }

    public final boolean g() {
        if (i()) {
            return true;
        }
        c cVarF = f();
        p();
        if (!(f() instanceof f)) {
            if (!(f() instanceof d)) {
                return false;
            }
            d dVar = (d) f();
            if (cVarF == null || dVar == null) {
                return false;
            }
            dVar.f20430a.add(cVarF.getValue());
            return false;
        }
        f fVar = (f) f();
        p();
        e eVar = (e) f();
        if (fVar == null || cVarF == null || eVar == null) {
            return false;
        }
        eVar.f20431a.put(fVar.f20432a, cVarF.getValue());
        return false;
    }

    public final boolean h(b bVar) throws IOException {
        Object objA = bVar.a();
        if (f() == null && objA != null) {
            q(new g(objA));
            return true;
        }
        if (f() instanceof f) {
            f fVar = (f) f();
            p();
            ((e) f()).f20431a.put(fVar.f20432a, objA);
            return false;
        }
        if (!(f() instanceof d)) {
            return false;
        }
        ((d) f()).f20430a.add(objA);
        return false;
    }

    public final boolean i() {
        return this.f20428a.size() == 1;
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object k(jtd jtdVar) throws IOException {
        try {
            try {
                return Integer.valueOf(jtdVar.nextInt());
            } catch (Exception unused) {
                return Double.valueOf(jtdVar.nextDouble());
            }
        } catch (Exception unused2) {
            return Long.valueOf(jtdVar.nextLong());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void o(@NotNull final jtd jtdVar) throws IOException {
        boolean zG;
        a aVar = null;
        switch (a.f20429a[jtdVar.peek().ordinal()]) {
            case 1:
                jtdVar.a();
                q(new d(aVar));
                o(jtdVar);
            case 2:
                jtdVar.b();
                zG = g();
                break;
            case 3:
                jtdVar.beginObject();
                q(new e(aVar));
                o(jtdVar);
            case 4:
                jtdVar.endObject();
                zG = g();
                break;
            case 5:
                q(new f(jtdVar.nextName()));
                o(jtdVar);
            case 6:
                zG = h(new b() { // from class: dtd
                    @Override // htd.b
                    public final Object a() {
                        return jtdVar.nextString();
                    }
                });
                break;
            case 7:
                zG = h(new b() { // from class: etd
                    @Override // htd.b
                    public final Object a() {
                        return this.f17043a.k(jtdVar);
                    }
                });
                break;
            case 8:
                zG = h(new b() { // from class: ftd
                    @Override // htd.b
                    public final Object a() {
                        return htd.l(jtdVar);
                    }
                });
                break;
            case 9:
                jtdVar.l();
                zG = h(new b() { // from class: gtd
                    @Override // htd.b
                    public final Object a() {
                        return htd.m();
                    }
                });
                break;
            case 10:
                return;
            default:
                o(jtdVar);
        }
        if (zG) {
            return;
        }
        o(jtdVar);
    }

    public final void p() {
        if (this.f20428a.isEmpty()) {
            return;
        }
        ArrayList<c> arrayList = this.f20428a;
        arrayList.remove(arrayList.size() - 1);
    }

    public final void q(c cVar) {
        this.f20428a.add(cVar);
    }

    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList<Object> f20430a;

        public d() {
            this.f20430a = new ArrayList<>();
        }

        @Override // htd.c
        @NotNull
        public Object getValue() {
            return this.f20430a;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public static final class e implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap<String, Object> f20431a;

        public e() {
            this.f20431a = new HashMap<>();
        }

        @Override // htd.c
        @NotNull
        public Object getValue() {
            return this.f20431a;
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }
}
