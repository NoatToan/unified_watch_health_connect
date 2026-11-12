package cw;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.x;

/* JADX INFO: loaded from: classes7.dex */
public final class j {
    public static final void a(ArrayList arrayList, l20.a aVar) {
        arrayList.getClass();
        if (aVar == null) {
            return;
        }
        String contactId = aVar.getContactId();
        String localId = aVar.getLocalId();
        int i14 = 0;
        if (contactId != null && contactId.length() != 0) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i14 = -1;
                    break;
                } else if (p005kotlin.jvm.internal.s.g(((l20.a) it.next()).getContactId(), contactId)) {
                    break;
                } else {
                    i14++;
                }
            }
        } else if (localId != null && localId.length() != 0) {
            Iterator it3 = arrayList.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i14 = -1;
                    break;
                } else if (p005kotlin.jvm.internal.s.g(((l20.a) it3.next()).getLocalId(), localId)) {
                    break;
                } else {
                    i14++;
                }
            }
        } else {
            i14 = -1;
            break;
        }
        if (i14 > -1) {
            arrayList.set(i14, aVar);
        } else {
            arrayList.add(aVar);
        }
    }

    public static final int b(List<l20.a> list) {
        l20.c cVar;
        l20.c cVar2;
        Object next;
        Object next2;
        int i14 = 0;
        if (list != null) {
            if (list.isEmpty()) {
                return 0;
            }
            for (l20.a aVar : list) {
                if (p005kotlin.jvm.internal.s.g(aVar.getIsLiveTrackDefault(), Boolean.TRUE)) {
                    List<l20.c> listR = aVar.r();
                    if (listR != null) {
                        Iterator<T> it = listR.iterator();
                        do {
                            if (!it.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it.next();
                        } while (!((l20.c) next2).g0());
                        cVar = (l20.c) next2;
                    } else {
                        cVar = null;
                    }
                    if (cVar == null) {
                        List<l20.c> listZ = aVar.z();
                        if (listZ != null) {
                            Iterator<T> it3 = listZ.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                            } while (!((l20.c) next).g0());
                            cVar2 = (l20.c) next;
                        } else {
                            cVar2 = null;
                        }
                        if (cVar2 == null) {
                            continue;
                        }
                    }
                    i14++;
                    if (i14 < 0) {
                        x.p();
                        throw null;
                    }
                }
            }
        }
        return i14;
    }

    public static o13.p c(Context context) {
        Intent intentD = sn.a.d(context, context, ContactActivity.class);
        Intent intent = new Intent(context, (Class<?>) ContactActivity.class);
        intent.putExtra("EXTRA_STARTED_AFTER_MIGRATION", true);
        return new o13.p(intentD, new Intent[]{intent});
    }

    public static final int d(List<l20.a> list) {
        int i14;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p005kotlin.jvm.internal.s.g(((l20.a) obj).getIsLiveEventSharingDefault(), Boolean.TRUE)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            List<l20.c> listZ = ((l20.a) it.next()).z();
            if (listZ == null || listZ.isEmpty()) {
                i14 = 0;
            } else {
                Iterator<T> it3 = listZ.iterator();
                i14 = 0;
                while (it3.hasNext()) {
                    if (p005kotlin.jvm.internal.s.g(((l20.c) it3.next()).getIsLiveEventSharingDefault(), Boolean.TRUE) && (i14 = i14 + 1) < 0) {
                        x.p();
                        throw null;
                    }
                }
            }
            i15 += i14;
        }
        return i15;
    }
}
