package org.apache.commons.codec.language.bm;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f133431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f133432b;

    public /* synthetic */ c(int i14, ArrayList arrayList) {
        this.f133431a = i14;
        this.f133432b = arrayList;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f133431a) {
            case 0:
                PhoneticEngine.lambda$encode$2(this.f133432b, (String) obj);
                break;
            default:
                this.f133432b.addAll((List) obj);
                break;
        }
    }
}
