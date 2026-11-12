package z6;

import android.app.Notification;
import android.app.RemoteInput;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ArrayList<k> f202745a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<Notification> f202746b = new ArrayList<>();

    public x(Notification notification) {
        Notification[] notificationArr;
        f0[] f0VarArr;
        IconCompat iconCompatA;
        k kVar;
        int i14;
        Bundle bundle = notification.extras;
        Bundle bundle2 = bundle != null ? bundle.getBundle("android.wearable.EXTENSIONS") : null;
        if (bundle2 != null) {
            ArrayList parcelableArrayList = bundle2.getParcelableArrayList("actions");
            if (parcelableArrayList != null) {
                int size = parcelableArrayList.size();
                k[] kVarArr = new k[size];
                for (int i15 = 0; i15 < size; i15++) {
                    Notification.Action action = (Notification.Action) parcelableArrayList.get(i15);
                    RemoteInput[] remoteInputs = action.getRemoteInputs();
                    if (remoteInputs == null) {
                        f0VarArr = null;
                    } else {
                        f0[] f0VarArr2 = new f0[remoteInputs.length];
                        for (int i16 = 0; i16 < remoteInputs.length; i16++) {
                            RemoteInput remoteInput = remoteInputs[i16];
                            f0VarArr2[i16] = new f0(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? l.c(remoteInput) : 0, remoteInput.getExtras(), null);
                        }
                        f0VarArr = f0VarArr2;
                    }
                    boolean z14 = action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies();
                    boolean z15 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
                    int semanticAction = action.getSemanticAction();
                    int i17 = Build.VERSION.SDK_INT;
                    boolean zE = i17 >= 29 ? l.e(action) : false;
                    boolean zA = i17 >= 31 ? m.a(action) : false;
                    if (action.getIcon() != null || (i14 = action.icon) == 0) {
                        if (action.getIcon() == null) {
                            iconCompatA = null;
                        } else {
                            Icon icon = action.getIcon();
                            PorterDuff.Mode mode = IconCompat.f6391k;
                            iconCompatA = (icon.getType() == 2 && icon.getResId() == 0) ? null : IconCompat.a.a(icon);
                        }
                        kVar = new k(iconCompatA, action.title, action.actionIntent, action.getExtras(), f0VarArr, (f0[]) null, z14, semanticAction, z15, zE, zA);
                    } else {
                        kVar = new k(i14, action.title, action.actionIntent, action.getExtras(), f0VarArr, (f0[]) null, z14, semanticAction, z15, zE, zA);
                    }
                    kVarArr[i15] = kVar;
                }
                Collections.addAll(this.f202745a, kVarArr);
            }
            bundle2.getInt("flags", 1);
            Parcelable[] parcelableArray = bundle2.getParcelableArray("pages");
            if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
                notificationArr = (Notification[]) parcelableArray;
            } else {
                notificationArr = new Notification[parcelableArray.length];
                for (int i18 = 0; i18 < parcelableArray.length; i18++) {
                    notificationArr[i18] = (Notification) parcelableArray[i18];
                }
                bundle2.putParcelableArray("pages", notificationArr);
            }
            if (notificationArr != null) {
                Collections.addAll(this.f202746b, notificationArr);
            }
            bundle2.getInt("contentIcon");
            bundle2.getInt("contentIconGravity", 8388613);
            bundle2.getInt("contentActionIndex", -1);
            bundle2.getInt("customSizePreset", 0);
            bundle2.getInt("customContentHeight");
            bundle2.getInt("gravity", 80);
            bundle2.getInt("hintScreenTimeout");
            bundle2.getString("dismissalId");
            bundle2.getString("bridgeTag");
        }
    }

    public final Object clone() {
        x xVar = new x();
        xVar.f202745a = new ArrayList<>(this.f202745a);
        xVar.f202746b = new ArrayList<>(this.f202746b);
        return xVar;
    }

    public x() {
    }
}
