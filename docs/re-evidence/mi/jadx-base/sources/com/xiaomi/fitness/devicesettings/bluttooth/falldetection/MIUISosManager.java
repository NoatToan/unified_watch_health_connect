package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.eg4;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0007\u001a\u00020\u00052\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/xiaomi/fitness/devicesettings/bluttooth/falldetection/MIUISosManager;", "", "Lkotlin/Function1;", "", "Leg4;", "", "callback", "supportSyncMIUISosContacts", "(Lkotlin/jvm/functions/Function1;)V", "", "name", RealNameWebViewActivity.NUMBER, "Landroid/net/Uri;", "insertMIUISosContacts", "(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;", "", "deleteMIUISosContacts", "(Ljava/lang/String;)I", "TAG", "Ljava/lang/String;", "MIUI_SOS_CONTACTS_URI", "<init>", "()V", "device-settings_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public final class MIUISosManager {

    @NotNull
    public static final MIUISosManager INSTANCE = new MIUISosManager();

    @NotNull
    private static final String MIUI_SOS_CONTACTS_URI = "content://com.android.settings.emergency.SosContactsProvider";

    @NotNull
    private static final String TAG = "MIUISosManager";

    private MIUISosManager() {
    }

    public final int deleteMIUISosContacts(@NotNull String number) {
        Intrinsics.checkNotNullParameter(number, "number");
        return ApplicationExtKt.getApplication().getContentResolver().delete(Uri.parse(MIUI_SOS_CONTACTS_URI), "number = ?", new String[]{number});
    }

    @Nullable
    public final Uri insertMIUISosContacts(@NotNull String name, @NotNull String number) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(number, "number");
        Uri uri = Uri.parse(MIUI_SOS_CONTACTS_URI);
        ContentValues contentValues = new ContentValues();
        contentValues.put("name", name);
        contentValues.put(RealNameWebViewActivity.NUMBER, number);
        return ApplicationExtKt.getApplication().getContentResolver().insert(uri, contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0039: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:8:0x0039 */
    public final void supportSyncMIUISosContacts(@NotNull Function1<? super List<eg4>, Unit> callback) throws Throwable {
        Cursor cursorQuery;
        Cursor cursor;
        Intrinsics.checkNotNullParameter(callback, "callback");
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = ApplicationExtKt.getApplication().getContentResolver().query(Uri.parse(MIUI_SOS_CONTACTS_URI), null, null, null, null);
                try {
                    Logger.i(TAG, "cursor: " + cursorQuery);
                    if (cursorQuery == null) {
                        callback.invoke2(null);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.getString(0);
                            String string2 = cursorQuery.getString(1);
                            Logger.d(TAG, "name: " + string + " number: " + string2);
                            eg4 eg4Var = new eg4();
                            eg4Var.c = string;
                            eg4Var.d = string2;
                            arrayList.add(eg4Var);
                        }
                        callback.invoke2(arrayList);
                    }
                    if (cursorQuery == null) {
                        return;
                    }
                } catch (Exception e) {
                    e = e;
                    callback.invoke2(null);
                    Logger.i(TAG, "exception: " + e);
                    e.printStackTrace();
                    if (cursorQuery == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        cursorQuery.close();
    }
}
