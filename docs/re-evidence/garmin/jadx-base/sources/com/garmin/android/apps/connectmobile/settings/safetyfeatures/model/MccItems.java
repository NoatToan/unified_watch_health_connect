package com.garmin.android.apps.connectmobile.settings.safetyfeatures.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/model/MccItems;", "Ljava/util/ArrayList;", "Lcom/garmin/android/apps/connectmobile/settings/safetyfeatures/model/MccItem;", "Lkotlin/collections/ArrayList;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MccItems extends ArrayList<MccItem> {
    public static final int $stable = 8;

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof MccItem) {
            return contains((MccItem) obj);
        }
        return false;
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof MccItem) {
            return indexOf((MccItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof MccItem) {
            return lastIndexOf((MccItem) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof MccItem) {
            return remove((MccItem) obj);
        }
        return false;
    }

    public /* bridge */ MccItem removeAt(int i14) {
        return remove(i14);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return getSize();
    }

    public /* bridge */ boolean contains(MccItem mccItem) {
        return super.contains((Object) mccItem);
    }

    public /* bridge */ int indexOf(MccItem mccItem) {
        return super.indexOf((Object) mccItem);
    }

    public /* bridge */ int lastIndexOf(MccItem mccItem) {
        return super.lastIndexOf((Object) mccItem);
    }

    public /* bridge */ boolean remove(MccItem mccItem) {
        return super.remove((Object) mccItem);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ MccItem remove(int i14) {
        return removeAt(i14);
    }
}
