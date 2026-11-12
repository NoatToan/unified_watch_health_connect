package tk;

import com.google.android.exoplayer2.audio.WavUtil;
import java.util.Objects;
import java.util.regex.Pattern;
import jk.n;
import jk.q;

/* JADX INFO: loaded from: classes7.dex */
public class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f165237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ byte f165238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ byte f165239c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ byte[] f165240d;

    public j(k kVar, g gVar, byte b14, byte b15, byte[] bArr) {
        this.f165237a = gVar;
        this.f165238b = b14;
        this.f165239c = b15;
        this.f165240d = bArr;
    }

    @Override // tk.h
    public final void T() {
        Pattern pattern = k.f165241i;
        g gVar = this.f165237a;
        if (gVar != null) {
            gVar.b("Could not write file to device: Task cancelled.");
        }
    }

    @Override // tk.h
    public final void a(vk.b bVar) {
        jk.j.a aVar = bVar.f99063k;
        Pattern pattern = k.f165241i;
        jk.j.c cVarU = bVar.u((byte) 4, new byte[]{0, 0, 0, 0, this.f165238b, this.f165239c, 0, 0, 0, 0, -1, -1}, false);
        Objects.toString(cVarU.f99081a);
        jk.j.d dVar = cVarU.f99081a;
        jk.j.d dVar2 = jk.j.d.SUCCESS;
        g gVar = this.f165237a;
        if (dVar != dVar2) {
            if (gVar != null) {
                gVar.b("Could not write file to device: Create upload result: " + cVarU.f99081a);
                return;
            }
            return;
        }
        jk.j.c cVarU2 = bVar.u((byte) 1, new byte[]{4, 0, 0, 0}, false);
        Objects.toString(cVarU2.f99081a);
        if (cVarU2.f99081a != dVar2) {
            if (gVar != null) {
                gVar.b("Could not write file to device: request result: " + cVarU2.f99081a);
                return;
            }
            return;
        }
        bVar.f99070r = null;
        jk.e eVar = new jk.e(aVar, null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, 5000);
        bVar.t(new jk.m(bVar, eVar));
        jk.j.f fVar = eVar.I;
        Objects.toString(fVar);
        if (fVar != jk.j.f.SUCCESS) {
            if (gVar != null) {
                gVar.b("Could not write file to device: response result: " + fVar);
                return;
            }
            return;
        }
        byte[] bArr = bVar.f99070r;
        cVarU2.f99082b = bArr;
        if (bArr[4] != 4) {
            if (gVar != null) {
                gVar.b("Could not write file to device: create file response for wrong command.");
                return;
            }
            return;
        }
        byte b14 = bArr[6];
        if (b14 != 0 && gVar != null) {
            gVar.b("Could not write file to device: response code: " + ((int) b14));
        }
        cVarU2.f99081a = dVar2;
        q qVar = new q(aVar, new i(this), new jk.j.e(cVarU2).f99092c, 0L, this.f165240d, 5000, true);
        bVar.t(new n(bVar, qVar));
        jk.j.EnumC1907j enumC1907j = qVar.B;
        Objects.toString(enumC1907j);
        if (enumC1907j == jk.j.EnumC1907j.SUCCESS) {
            if (gVar != null) {
                gVar.a(Boolean.TRUE);
            }
        } else if (gVar != null) {
            gVar.b("Could not write file to device: " + enumC1907j.toString());
        }
    }

    @Override // tk.h
    public final void b(jk.j.i iVar) {
        Pattern pattern = k.f165241i;
        g gVar = this.f165237a;
        if (gVar != null) {
            gVar.b("Could not write file to device: " + iVar.toString());
        }
    }
}
