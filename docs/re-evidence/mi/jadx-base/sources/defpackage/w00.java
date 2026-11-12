package defpackage;

import com.google.common.hash.Funnel;

/* JADX INFO: loaded from: classes5.dex */
public abstract class w00 implements olb {
    @Override // defpackage.olb
    public <T> olb b(T t, Funnel<? super T> funnel) {
        funnel.funnel(t, this);
        return this;
    }
}
