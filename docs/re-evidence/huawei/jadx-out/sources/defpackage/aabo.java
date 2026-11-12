package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class aabo extends aabc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<c> f93b;
    private final byte[] d;

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f94a;
        private int d;
        private int e;

        private c(int i, int i2) {
            this.d = i;
            this.f94a = i2;
            this.e = i + i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i) {
            if (this.e > i) {
                int i2 = this.d;
                if (i < i2) {
                    throw new IllegalArgumentException("adjusted end before offset!");
                }
                this.e = i;
                this.f94a = i - i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i) {
            if (this.e < i) {
                this.e = i;
                this.f94a = i - this.d;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int c(int i) {
            int i2 = this.d;
            if (i2 >= i) {
                return 0;
            }
            int i3 = this.e;
            if (i3 <= i) {
                this.f94a = 0;
                this.d = i;
                this.e = i;
                return 0;
            }
            this.d = i;
            this.f94a = i3 - i;
            return i - i2;
        }

        public String toString() {
            return String.format("range[%d:%d)", Integer.valueOf(this.d), Integer.valueOf(this.e));
        }
    }

    public aabo(aaav aaavVar) {
        super(aaavVar.getMessageType());
        this.f93b = new ArrayList();
        setMessageSeq(aaavVar.getMessageSeq());
        this.d = new byte[aaavVar.getMessageLength()];
        d(0, 0, new c(aaavVar.getFragmentOffset(), aaavVar.getFragmentLength()), aaavVar);
    }

    public boolean a() {
        c cVar = this.f93b.get(0);
        return cVar.d == 0 && getMessageLength() <= cVar.e;
    }

    public void c(aaav aaavVar) {
        if (getMessageType() != aaavVar.getMessageType()) {
            throw new IllegalArgumentException("Fragment message type " + aaavVar.getMessageType() + " differs from " + getMessageType() + "!");
        }
        if (getMessageSeq() != aaavVar.getMessageSeq()) {
            throw new IllegalArgumentException("Fragment message sequence number " + aaavVar.getMessageSeq() + " differs from " + getMessageSeq() + "!");
        }
        if (getMessageLength() != aaavVar.getMessageLength()) {
            throw new IllegalArgumentException("Fragment message length " + aaavVar.getMessageLength() + " differs from " + getMessageLength() + "!");
        }
        if (a()) {
            return;
        }
        c cVar = new c(aaavVar.getFragmentOffset(), aaavVar.getFragmentLength());
        if (getMessageLength() < cVar.e) {
            throw new IllegalArgumentException("Fragment message " + cVar.e + " bytes exceeds message " + getMessageLength() + " bytes!");
        }
        int i = 0;
        int i2 = 0;
        while (i < this.f93b.size()) {
            c cVar2 = this.f93b.get(i);
            if (cVar.d < cVar2.d) {
                if (cVar2.d >= cVar.e || cVar.e > cVar2.e) {
                    break;
                    break;
                } else {
                    cVar.b(cVar2.d);
                    break;
                }
            }
            if (cVar.e <= cVar2.e) {
                return;
            }
            if (cVar.d == cVar2.d) {
                i++;
                break;
            } else {
                i2 = cVar2.e;
                i++;
            }
        }
        int iC = cVar.c(i2);
        if (cVar.f94a == 0) {
            return;
        }
        d(i, iC, cVar, aaavVar);
        c cVar3 = this.f93b.get(0);
        int i3 = 1;
        while (i3 < this.f93b.size()) {
            c cVar4 = this.f93b.get(i3);
            if (cVar4.d <= cVar3.e) {
                cVar3.d(cVar4.e);
                this.f93b.remove(i3);
                i3--;
            } else {
                cVar3 = cVar4;
            }
            i3++;
        }
    }

    private void d(int i, int i2, c cVar, aaav aaavVar) {
        this.f93b.add(i, cVar);
        System.arraycopy(aaavVar.fragmentToByteArray(), i2, this.d, cVar.d, cVar.f94a);
    }

    @Override // defpackage.aabc, org.eclipse.californium.scandium.dtls.HandshakeMessage
    public int getMessageLength() {
        return this.d.length;
    }

    @Override // defpackage.aabc, org.eclipse.californium.scandium.dtls.HandshakeMessage
    public String getImplementationTypePrefix() {
        return "Reassembling ";
    }

    @Override // org.eclipse.californium.scandium.dtls.HandshakeMessage, org.eclipse.californium.scandium.dtls.DTLSMessage
    public String toString(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString(i));
        String strD = zzp.d(i);
        String strD2 = zzp.d(i + 1);
        sb.append(strD);
        sb.append("Reassembled Fragments: ");
        sb.append(this.f93b.size());
        sb.append(zzp.c());
        for (c cVar : this.f93b) {
            sb.append(strD2);
            sb.append(cVar);
            sb.append(zzp.c());
        }
        return sb.toString();
    }

    @Override // defpackage.aabc, org.eclipse.californium.scandium.dtls.HandshakeMessage
    public byte[] fragmentToByteArray() {
        return this.d;
    }
}
