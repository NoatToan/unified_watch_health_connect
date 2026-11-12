package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.scte35.PrivateCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand;
import com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand;
import com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class d7n extends adm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final okh f15194a = new okh();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nkh f15195b = new nkh();
    public rfp c;

    @Override // defpackage.adm
    public Metadata b(mtf mtfVar, ByteBuffer byteBuffer) {
        Metadata.Entry spliceNullCommand;
        rfp rfpVar = this.c;
        if (rfpVar == null || mtfVar.i != rfpVar.e()) {
            rfp rfpVar2 = new rfp(mtfVar.e);
            this.c = rfpVar2;
            rfpVar2.a(mtfVar.e - mtfVar.i);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f15194a.N(bArrArray, iLimit);
        this.f15195b.o(bArrArray, iLimit);
        this.f15195b.r(39);
        long jH = (((long) this.f15195b.h(1)) << 32) | ((long) this.f15195b.h(32));
        this.f15195b.r(20);
        int iH = this.f15195b.h(12);
        int iH2 = this.f15195b.h(8);
        this.f15194a.Q(14);
        if (iH2 == 0) {
            spliceNullCommand = new SpliceNullCommand();
        } else if (iH2 == 255) {
            spliceNullCommand = PrivateCommand.a(this.f15194a, iH, jH);
        } else if (iH2 == 4) {
            spliceNullCommand = SpliceScheduleCommand.a(this.f15194a);
        } else if (iH2 != 5) {
            spliceNullCommand = iH2 != 6 ? null : TimeSignalCommand.a(this.f15194a, jH, this.c);
        } else {
            spliceNullCommand = SpliceInsertCommand.a(this.f15194a, jH, this.c);
        }
        return spliceNullCommand == null ? new Metadata(new Metadata.Entry[0]) : new Metadata(spliceNullCommand);
    }
}
