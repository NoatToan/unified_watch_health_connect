package com.huami.ai.speech.xiaoai.capability.skill;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.provider.CallLog;
import android.provider.ContactsContract;
import android.text.TextUtils;
import androidx.core.content.PermissionChecker;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.ai.entity.phone.CallType;
import com.huami.ai.entity.phone.Contact;
import com.huami.ai.entity.phone.SimType;
import com.huami.ai.skill.PhoneCallSkill;
import com.huami.assistant.model.bean.Update;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0003J\u0010\u0010\n\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0003J\u0010\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0003J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R#\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/ai/speech/xiaoai/capability/skill/PhoneCallSkillImpl;", "Lcom/huami/ai/skill/PhoneCallSkill;", "", "phoneNum", "Lcom/huami/ai/entity/phone/SimType;", "simType", "", "b", "Lcom/huami/ai/entity/phone/CallType;", "callType", GoogleApiAvailabilityLight.a, "name", "e", PointCategory.PERMISSION, "", "c", "Landroid/content/Intent;", "intent", "a", "Lcom/huami/ai/entity/phone/Contact;", ContactSettingItemActivity.KEY_CONTACT, "makeCall", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "Lkotlin/Lazy;", "f", "()[Ljava/lang/String;", "dualSimTypes", "<init>", "(Landroid/content/Context;)V", "speech-xiaoai_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallSkillImpl implements PhoneCallSkill {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Lazy dualSimTypes = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[CallType.values().length];
            iArr[CallType.RECENT_MISSED_CALL.ordinal()] = 1;
            iArr[CallType.RECENT_ANSWERED_CALL.ordinal()] = 2;
            iArr[CallType.RECENT_OUTGOING_CALL.ordinal()] = 3;
            iArr[CallType.RECENT_ALL_CALL.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[SimType.values().length];
            iArr2[SimType.CARD_ONE.ordinal()] = 1;
            iArr2[SimType.CARD_TWO.ordinal()] = 2;
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, d2 = {"", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String[]> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String[] invoke() {
            return new String[]{"subscription", "Subscription", "com.android.phone.extra.slot", "phone", "com.android.phone.DialingMode", "simId", "simnum", "phone_type", "simSlot"};
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "小爱拨打电话，但是无权限";
        }
    }

    public PhoneCallSkillImpl(@NotNull Context context) {
        this.context = context;
    }

    private final void a(Intent intent, SimType simType) {
        int i = WhenMappings.$EnumSwitchMapping$1[simType.ordinal()];
        int i2 = (i == 1 || i != 2) ? 0 : 1;
        for (String str : f()) {
            intent.putExtra(str, i2);
        }
    }

    @SuppressLint({"MissingPermission"})
    private final void b(String phoneNum, SimType simType) throws NoPermissionException {
        if (!c("android.permission.CALL_PHONE")) {
            throw new NoPermissionException();
        }
        Intent intent = new Intent("android.intent.action.CALL");
        intent.setData(Uri.parse(Intrinsics.stringPlus("tel:", phoneNum)));
        intent.setFlags(268435456);
        if (simType != SimType.DEFAULT) {
            a(intent, simType);
        }
        this.context.startActivity(intent);
    }

    private final boolean c(String permission) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if (this.context.getApplicationInfo().targetSdkVersion < 23) {
            return PermissionChecker.checkPermission(this.context, permission, Binder.getCallingPid(), Binder.getCallingUid(), this.context.getPackageName()) == 0;
        }
        return this.context.checkSelfPermission(permission) == 0;
    }

    @SuppressLint({"Recycle", "MissingPermission"})
    private final String d(CallType callType) throws NoPermissionException {
        if (!c("android.permission.READ_CALL_LOG")) {
            throw new NoPermissionException();
        }
        int i = WhenMappings.$EnumSwitchMapping$0[callType.ordinal()];
        int i2 = 3;
        if (i != 1) {
            if (i == 2) {
                i2 = 1;
            } else if (i == 3) {
                i2 = 2;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i2 = -1;
            }
        }
        Cursor cursorQuery = this.context.getContentResolver().query(CallLog.Calls.CONTENT_URI, new String[]{"name", "number", "type"}, null, null, "date DESC");
        String string = "";
        if (cursorQuery == null) {
            return "";
        }
        while (cursorQuery.moveToNext()) {
            if (i2 == -1 || i2 == cursorQuery.getInt(cursorQuery.getColumnIndex("type"))) {
                string = cursorQuery.getString(cursorQuery.getColumnIndex("number"));
            }
        }
        cursorQuery.close();
        return string;
    }

    @SuppressLint({"Recycle"})
    private final String e(String name) throws NoPermissionException {
        if (!c("android.permission.READ_CONTACTS")) {
            throw new NoPermissionException();
        }
        Cursor cursorQuery = this.context.getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI, new String[]{"display_name", Update.COLUMN_DATA1}, "display_name=?", new String[]{name}, null);
        if (cursorQuery == null) {
            return "";
        }
        String string = cursorQuery.moveToNext() ? cursorQuery.getString(cursorQuery.getColumnIndex(Update.COLUMN_DATA1)) : "";
        cursorQuery.close();
        return string;
    }

    private final String[] f() {
        return (String[]) this.dualSimTypes.getValue();
    }

    @Override // com.huami.ai.skill.PhoneCallSkill
    public void makeCall(@NotNull SimType simType, @Nullable CallType callType, @Nullable Contact contact) {
        String strE;
        try {
            if (callType != null) {
                strE = d(callType);
            } else {
                if ((contact == null ? null : contact.getNumber()) == null || TextUtils.isEmpty(contact.getNumber())) {
                    strE = (contact == null || TextUtils.isEmpty(contact.getName())) ? "" : e(contact.getName());
                } else {
                    strE = contact.getNumber();
                }
            }
            if (TextUtils.isEmpty(strE)) {
                return;
            }
            b(strE, simType);
        } catch (NoPermissionException unused) {
            HMLog.error$default("speech", null, null, b.a, 6, null);
        }
    }
}
