package defpackage;

import android.net.Uri;
import com.google.android.exoplayer2.offline.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bk5 implements ym9<bk5> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4304b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final nlq i;
    public final lyl j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Uri f4305k;
    public final aci l;
    public final List<uqh> m;

    public bk5(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, aci aciVar, nlq nlqVar, lyl lylVar, Uri uri, List<uqh> list) {
        this.f4303a = j;
        this.f4304b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = aciVar;
        this.i = nlqVar;
        this.f4305k = uri;
        this.j = lylVar;
        this.m = list == null ? Collections.emptyList() : list;
    }

    public static ArrayList<dp0> c(List<dp0> list, LinkedList<StreamKey> linkedList) {
        StreamKey streamKeyPoll = linkedList.poll();
        int i = streamKeyPoll.f8048a;
        ArrayList<dp0> arrayList = new ArrayList<>();
        do {
            int i2 = streamKeyPoll.f8049b;
            dp0 dp0Var = list.get(i2);
            List<tmk> list2 = dp0Var.c;
            ArrayList arrayList2 = new ArrayList();
            do {
                arrayList2.add(list2.get(streamKeyPoll.c));
                streamKeyPoll = linkedList.poll();
                if (streamKeyPoll.f8048a != i) {
                    break;
                }
            } while (streamKeyPoll.f8049b == i2);
            arrayList.add(new dp0(dp0Var.f15770a, dp0Var.f15771b, arrayList2, dp0Var.d, dp0Var.e, dp0Var.f));
        } while (streamKeyPoll.f8048a == i);
        linkedList.addFirst(streamKeyPoll);
        return arrayList;
    }

    @Override // defpackage.ym9
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bk5 a(List<StreamKey> list) {
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j = 0;
        int i = 0;
        while (true) {
            if (i >= e()) {
                break;
            }
            if (((StreamKey) linkedList.peek()).f8048a != i) {
                long jF = f(i);
                if (jF != -9223372036854775807L) {
                    j += jF;
                }
            } else {
                uqh uqhVarD = d(i);
                arrayList.add(new uqh(uqhVarD.f36027a, uqhVarD.f36028b - j, c(uqhVarD.c, linkedList), uqhVarD.d));
            }
            i++;
        }
        long j2 = this.f4304b;
        return new bk5(this.f4303a, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.f4305k, arrayList);
    }

    public final uqh d(int i) {
        return this.m.get(i);
    }

    public final int e() {
        return this.m.size();
    }

    public final long f(int i) {
        long j;
        long j2;
        if (i == this.m.size() - 1) {
            j = this.f4304b;
            if (j == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            j2 = this.m.get(i).f36028b;
        } else {
            j = this.m.get(i + 1).f36028b;
            j2 = this.m.get(i).f36028b;
        }
        return j - j2;
    }

    public final long g(int i) {
        return g83.c(f(i));
    }
}
