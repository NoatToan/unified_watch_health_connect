package com.ingenic.iwds.content;

import android.content.ClipData;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.ingenic.iwds.os.RemoteBundle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes18.dex */
public class RemoteIntent implements Parcelable, Cloneable {
    public static final Parcelable.Creator<RemoteIntent> CREATOR = new a();
    private String a;
    private Uri b;
    private String c;
    private int d;
    private String e;
    private ComponentName f;
    private Rect g;
    private Set<String> h;
    private RemoteIntent i;
    private ClipData j;
    private RemoteBundle k;

    public static class a implements Parcelable.Creator<RemoteIntent> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RemoteIntent createFromParcel(Parcel parcel) {
            return new RemoteIntent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public RemoteIntent[] newArray(int i) {
            return new RemoteIntent[i];
        }
    }

    public RemoteIntent(RemoteIntent remoteIntent) {
        this.a = remoteIntent.a;
        this.b = remoteIntent.b;
        this.c = remoteIntent.c;
        this.d = remoteIntent.d;
        this.e = remoteIntent.e;
        this.f = remoteIntent.f;
        if (remoteIntent.g != null) {
            this.g = new Rect(remoteIntent.g);
        }
        if (remoteIntent.h != null) {
            this.h = new HashSet(remoteIntent.h);
        }
        RemoteIntent remoteIntent2 = remoteIntent.i;
        if (remoteIntent2 != null) {
            this.i = new RemoteIntent(remoteIntent2);
        }
        if (remoteIntent.j != null) {
            this.j = new ClipData(remoteIntent.j);
        }
        if (remoteIntent.k != null) {
            this.k = new RemoteBundle(remoteIntent.k);
        }
    }

    public static RemoteIntent fromIntent(Intent intent) {
        if (intent == null) {
            return null;
        }
        return new RemoteIntent(intent);
    }

    public Object clone() {
        return new RemoteIntent(this);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Intent toIntent() {
        Intent intent = new Intent(this.a);
        intent.setData(this.b);
        intent.setType(this.c);
        intent.setFlags(this.d);
        intent.setPackage(this.e);
        intent.setComponent(this.f);
        intent.setSourceBounds(this.g);
        Set<String> set = this.h;
        if (set != null) {
            Iterator<String> it2 = set.iterator();
            while (it2.hasNext()) {
                intent.addCategory(it2.next().intern());
            }
        }
        RemoteIntent remoteIntent = this.i;
        intent.setSelector(remoteIntent != null ? remoteIntent.toIntent() : null);
        intent.setClipData(this.j);
        RemoteBundle remoteBundle = this.k;
        intent.putExtras(remoteBundle != null ? remoteBundle.toBundle() : null);
        return intent;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        Uri.writeToParcel(parcel, this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        ComponentName.writeToParcel(this.f, parcel);
        if (this.g != null) {
            parcel.writeInt(1);
            this.g.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        Set<String> set = this.h;
        if (set != null) {
            parcel.writeInt(set.size());
            Iterator<String> it2 = this.h.iterator();
            while (it2.hasNext()) {
                parcel.writeString(it2.next());
            }
        } else {
            parcel.writeInt(0);
        }
        if (this.i != null) {
            parcel.writeInt(1);
            this.i.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.j != null) {
            parcel.writeInt(1);
            this.j.writeToParcel(parcel, i);
        } else {
            parcel.writeInt(0);
        }
        if (this.k == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            this.k.writeToParcel(parcel, i);
        }
    }

    public RemoteIntent(Intent intent) {
        this.a = intent.getAction();
        this.b = intent.getData();
        this.c = intent.getType();
        this.d = intent.getFlags();
        this.e = intent.getPackage();
        this.f = intent.getComponent();
        this.g = intent.getSourceBounds();
        Set<String> categories = intent.getCategories();
        if (categories != null) {
            this.h = new HashSet(categories);
        }
        Intent selector = intent.getSelector();
        if (selector != null) {
            this.i = new RemoteIntent(selector);
        }
        ClipData clipData = intent.getClipData();
        if (clipData != null) {
            this.j = new ClipData(clipData);
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.k = RemoteBundle.fromBunble(extras);
        }
    }

    public RemoteIntent(Parcel parcel) {
        this.a = parcel.readString();
        this.b = (Uri) Uri.CREATOR.createFromParcel(parcel);
        this.c = parcel.readString();
        this.d = parcel.readInt();
        this.e = parcel.readString();
        this.f = ComponentName.readFromParcel(parcel);
        if (parcel.readInt() != 0) {
            this.g = (Rect) Rect.CREATOR.createFromParcel(parcel);
        }
        int i = parcel.readInt();
        if (i > 0) {
            this.h = new HashSet();
            for (int i2 = 0; i2 < i; i2++) {
                this.h.add(parcel.readString().intern());
            }
        } else {
            this.h = null;
        }
        if (parcel.readInt() != 0) {
            this.i = CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() != 0) {
            this.j = (ClipData) ClipData.CREATOR.createFromParcel(parcel);
        }
        if (parcel.readInt() != 0) {
            this.k = RemoteBundle.CREATOR.createFromParcel(parcel);
        }
    }
}
