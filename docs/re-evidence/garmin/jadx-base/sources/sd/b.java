package sd;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\r\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lsd/b;", "Li63/c;", "", "", "<init>", "()V", "savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements i63.c<List<? extends CharSequence>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f158567a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k63.f f158568b = k63.k.d("kotlin.collections.List<kotlin.CharSequence>", new k63.e[0]);

    private b() {
    }

    @Override // i63.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ArrayList deserialize(l63.e eVar) {
        eVar.getClass();
        if (!(eVar instanceof rd.f)) {
            f158567a.getClass();
            vb.h.x(oe2.f.m(f158568b.f103233a, eVar));
            return null;
        }
        rd.f fVar = (rd.f) eVar;
        Bundle bundle = fVar.f151998b;
        bundle.getClass();
        String str = fVar.f152000d;
        str.getClass();
        ArrayList<CharSequence> charSequenceArrayList = bundle.getCharSequenceArrayList(str);
        if (charSequenceArrayList != null) {
            return charSequenceArrayList;
        }
        gg.b.J(str);
        throw null;
    }

    @Override // i63.i
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void serialize(l63.f fVar, List<? extends CharSequence> list) {
        list.getClass();
        if (!(fVar instanceof rd.g)) {
            f158567a.getClass();
            vb.h.x(oe2.f.n(f158568b.f103233a, fVar));
            return;
        }
        rd.g gVar = (rd.g) fVar;
        Bundle bundle = gVar.f152002a;
        bundle.getClass();
        String str = gVar.f152004c;
        str.getClass();
        bundle.putCharSequenceArrayList(str, gl1.d.Z(list));
    }

    @Override // i63.i, i63.b
    /* JADX INFO: renamed from: getDescriptor */
    public final k63.e getF158591b() {
        return f158568b;
    }
}
