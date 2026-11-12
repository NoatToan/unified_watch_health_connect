package tk;

import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.EnumSet;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class a implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f165201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165202b;

    public a(c cVar, g gVar, int i14) {
        this.f165201a = gVar;
        this.f165202b = i14;
    }

    @Override // tk.h
    public final void T() {
        g gVar = this.f165201a;
        if (gVar != null) {
            gVar.b("Could not set archive bit on file: Task cancelled.");
        }
    }

    @Override // tk.h
    public final void a(vk.b bVar) {
        jk.a aVar = jk.a.ARCHIVE;
        EnumSet enumSetOf = EnumSet.of(aVar);
        byte[] bArr = new byte[4];
        ik.a.b(0, this.f165202b, bArr);
        byte b14 = enumSetOf.contains(jk.a.READ) ? (byte) 128 : (byte) 0;
        if (enumSetOf.contains(jk.a.WRITE)) {
            b14 = (byte) (b14 | SignedBytes.MAX_POWER_OF_TWO);
        }
        if (enumSetOf.contains(jk.a.ERASE)) {
            b14 = (byte) (b14 | 32);
        }
        if (enumSetOf.contains(aVar)) {
            b14 = (byte) (b14 | Ascii.DLE);
        }
        if (enumSetOf.contains(jk.a.APPEND)) {
            b14 = (byte) (b14 | 8);
        }
        if (enumSetOf.contains(jk.a.CRYPTO)) {
            b14 = (byte) (b14 | 4);
        }
        bArr[3] = b14;
        ik.a.a(2, 0, bArr);
        jk.j.c cVarU = bVar.u((byte) 10, bArr, true);
        Objects.toString(cVarU.f99081a);
        jk.j.d dVar = cVarU.f99081a;
        jk.j.d dVar2 = jk.j.d.SUCCESS;
        g gVar = this.f165201a;
        if (dVar == dVar2) {
            if (gVar != null) {
                gVar.a(Boolean.TRUE);
            }
        } else if (gVar != null) {
            gVar.b("Could not set archive bit on file: " + cVarU.f99081a.toString());
        }
    }

    @Override // tk.h
    public final void b(jk.j.i iVar) {
        g gVar = this.f165201a;
        if (gVar != null) {
            gVar.b("Could not set archive bit on file: " + iVar.toString());
        }
    }
}
