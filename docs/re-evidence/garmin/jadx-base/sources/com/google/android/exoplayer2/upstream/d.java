package com.google.android.exoplayer2.upstream;

import com.google.common.base.Predicate;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class d implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53132a;

    public /* synthetic */ d(int i14) {
        this.f53132a = i14;
    }

    @Override // com.google.common.base.Predicate
    public final boolean apply(Object obj) {
        switch (this.f53132a) {
            case 0:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$keySet$0((String) obj);
            case 1:
                return DefaultHttpDataSource.NullFilteringHeadersMap.lambda$entrySet$1((Map.Entry) obj);
            default:
                return HttpDataSource.lambda$static$0((String) obj);
        }
    }
}
