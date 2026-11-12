package com.huawei.picture.security.base.intent;

import android.content.Intent;
import android.os.Parcelable;
import com.huawei.secure.android.common.intent.SafeIntent;
import defpackage.ord;
import defpackage.ork;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes41.dex */
public class ParcelableSafeIntent extends SafeIntent {
    private static final String TAG = "ParcelableSafeIntent";

    public ParcelableSafeIntent(Intent intent) {
        super(intent);
    }

    @Override // com.huawei.secure.android.common.intent.SafeIntent, android.content.Intent
    @Deprecated
    public <T extends Parcelable> T getParcelableExtra(String str) {
        return (T) super.getParcelableExtra(str);
    }

    @Override // com.huawei.secure.android.common.intent.SafeIntent, android.content.Intent
    @Deprecated
    public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String str) {
        return super.getParcelableArrayListExtra(str);
    }

    @Override // com.huawei.secure.android.common.intent.SafeIntent, android.content.Intent
    public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String str, Class<T> cls) {
        try {
            ArrayList<T> arrayList = new ArrayList<>();
            ArrayList<T> parcelableArrayListExtra = super.getParcelableArrayListExtra(str);
            if (ord.e(parcelableArrayListExtra)) {
                return null;
            }
            for (T t : parcelableArrayListExtra) {
                if (cls.isInstance(t)) {
                    arrayList.add(cls.cast(t));
                }
            }
            return arrayList;
        } catch (Exception e) {
            ork.a(TAG, "getParcelableArrayListExtra Exception: ", e);
            return null;
        }
    }
}
