package org.apache.commons.codec.language.bm;

import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133438b;

    public /* synthetic */ e(Object obj, int i14) {
        this.f133437a = i14;
        this.f133438b = obj;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f133437a) {
            case 0:
                ((Rule.Phoneme) obj).append((CharSequence) this.f133438b);
                break;
            default:
                PhoneticEngine.lambda$applyFinalRules$0((Map) this.f133438b, (Rule.Phoneme) obj);
                break;
        }
    }
}
