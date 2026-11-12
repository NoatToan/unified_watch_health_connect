package org.apache.commons.codec.language.bm;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f133435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractMap f133436d;

    public /* synthetic */ d(Object obj, Object obj2, AbstractMap abstractMap, int i14) {
        this.f133433a = i14;
        this.f133434b = obj;
        this.f133435c = obj2;
        this.f133436d = abstractMap;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f133433a) {
            case 0:
                ((PhoneticEngine) this.f133434b).lambda$applyFinalRules$1((Map) this.f133435c, (TreeMap) this.f133436d, (Rule.Phoneme) obj);
                break;
            default:
                Rule.lambda$static$1((NameType) this.f133434b, (RuleType) this.f133435c, (HashMap) this.f133436d, (String) obj);
                break;
        }
    }
}
