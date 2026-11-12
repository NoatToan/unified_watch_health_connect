package bs2;

import com.garmin.fit.FitRuntimeException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public class fk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList<wc> f20136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList<h7> f20137e;

    public fk(bk bkVar) {
        this.f20133a = bkVar.f19751a;
        int i14 = bkVar.f19752b;
        this.f20134b = i14;
        this.f20135c = 1;
        if (i14 >= 16) {
            throw new FitRuntimeException(am.j.q(new StringBuilder("Invalid local message number "), this.f20134b, ".  Local message number must be < 16."));
        }
        this.f20136d = new ArrayList<>();
        this.f20137e = new ArrayList<>();
        Iterator<rc> it = bkVar.f19753c.iterator();
        while (it.hasNext()) {
            this.f20136d.add(new wc(it.next()));
        }
        Iterator<g7> it3 = bkVar.f19754d.iterator();
        while (it3.hasNext()) {
            this.f20137e.add(new h7(it3.next()));
        }
    }

    public final int a() {
        Iterator<h7> it = this.f20137e.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            i14 += it.next().f20180c;
        }
        return i14;
    }

    public final void b(OutputStream outputStream) {
        ArrayList<wc> arrayList = this.f20136d;
        ArrayList<h7> arrayList2 = this.f20137e;
        try {
            int i14 = this.f20134b & 15;
            int i15 = i14 | 64;
            if (!arrayList2.isEmpty()) {
                i15 = i14 | 96;
            }
            outputStream.write(i15);
            outputStream.write(0);
            outputStream.write(1);
            outputStream.write(this.f20133a >> 8);
            outputStream.write(this.f20133a);
            outputStream.write(arrayList.size());
            for (wc wcVar : arrayList) {
                wcVar.getClass();
                try {
                    outputStream.write(wcVar.f20643a);
                    outputStream.write(wcVar.f20644b);
                    outputStream.write(wcVar.f20645c);
                } catch (IOException unused) {
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            outputStream.write(arrayList2.size());
            for (h7 h7Var : arrayList2) {
                h7Var.getClass();
                try {
                    outputStream.write(h7Var.f20178a.k(1).shortValue());
                    outputStream.write(h7Var.f20180c);
                    outputStream.write(h7Var.f20178a.k(0).shortValue());
                } catch (IOException e4) {
                    throw new FitRuntimeException(e4);
                }
            }
        } catch (IOException e14) {
            throw new FitRuntimeException(e14);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk)) {
            return false;
        }
        fk fkVar = (fk) obj;
        ArrayList<wc> arrayList = fkVar.f20136d;
        if (this.f20133a != fkVar.f20133a || this.f20134b != fkVar.f20134b) {
            return false;
        }
        ArrayList<wc> arrayList2 = this.f20136d;
        if (arrayList2.size() != arrayList.size()) {
            return false;
        }
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            if (!arrayList2.get(i14).equals(arrayList.get(i14))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.f20136d.hashCode() + ((new Integer(this.f20134b).hashCode() + ((new Integer(this.f20133a).hashCode() + 31) * 47)) * 19);
    }

    public fk() {
        this.f20133a = ik.f20217a;
        this.f20134b = 0;
        this.f20135c = 1;
        this.f20136d = new ArrayList<>();
        this.f20137e = new ArrayList<>();
    }
}
