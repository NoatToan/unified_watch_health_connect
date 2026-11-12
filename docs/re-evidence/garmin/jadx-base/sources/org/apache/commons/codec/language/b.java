package org.apache.commons.codec.language;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return DaitchMokotoffSoundex.lambda$static$0((DaitchMokotoffSoundex.Rule) obj, (DaitchMokotoffSoundex.Rule) obj2);
    }
}
