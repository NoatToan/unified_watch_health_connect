package org.apache.commons.codec.language.bm;

import java.io.Serializable;
import java.util.HashSet;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f133428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Serializable f133429c;

    public /* synthetic */ a(Object obj, Serializable serializable, int i14) {
        this.f133427a = i14;
        this.f133428b = obj;
        this.f133429c = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f133427a) {
            case 0:
                Lang.lambda$guessLanguages$0((String) this.f133428b, (HashSet) this.f133429c, (Lang.LangRule) obj);
                break;
            default:
                ((PhoneticEngine) this.f133428b).lambda$encode$3((StringBuilder) this.f133429c, (String) obj);
                break;
        }
    }
}
