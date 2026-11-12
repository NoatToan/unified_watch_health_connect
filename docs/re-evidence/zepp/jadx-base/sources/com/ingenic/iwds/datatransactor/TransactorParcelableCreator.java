package com.ingenic.iwds.datatransactor;

import android.os.Parcelable;
import com.ingenic.iwds.os.SafeParcelable;

/* JADX INFO: loaded from: classes18.dex */
public abstract class TransactorParcelableCreator<T1 extends Parcelable, T2 extends SafeParcelable> {
    public Parcelable.Creator<T1> m_parcelableCreator;
    public SafeParcelable.Creator<T2> m_safeParcelableCreator;
}
