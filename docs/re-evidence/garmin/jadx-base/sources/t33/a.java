package t33;

import j23.k;
import j23.l;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.p0;
import p13.y;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends u33.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C3058a f162236f = new C3058a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f162237g = new a(1, 0, 7);

    static {
        new a(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int... iArr) {
        super(Arrays.copyOf(iArr, iArr.length));
        iArr.getClass();
    }

    /* JADX INFO: renamed from: t33.a$a, reason: collision with other inner class name */
    public static final class C3058a {
        public /* synthetic */ C3058a(j jVar) {
            this();
        }

        public static a a(InputStream inputStream) {
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            l lVar = new l(1, dataInputStream.readInt());
            ArrayList arrayList = new ArrayList(y.r(lVar, 10));
            Iterator<Integer> it = lVar.iterator();
            while (((k) it).f96801c) {
                ((p0) it).nextInt();
                arrayList.add(Integer.valueOf(dataInputStream.readInt()));
            }
            int[] iArrA1 = h0.a1(arrayList);
            return new a(Arrays.copyOf(iArrA1, iArrA1.length));
        }

        private C3058a() {
        }
    }
}
