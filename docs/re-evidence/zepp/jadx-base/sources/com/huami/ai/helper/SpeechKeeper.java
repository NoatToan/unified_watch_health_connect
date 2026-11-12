package com.huami.ai.helper;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/huami/ai/helper/SpeechKeeper;", "", "<init>", "()V", "Companion", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
public final class SpeechKeeper {

    @NotNull
    private static final String a = "SPEECH";

    @NotNull
    private static final String b = "GUIDE_SIZE";

    @NotNull
    private static final String c = "GUIDE";
    private static final int d = 3;

    @NotNull
    private static final String e = "GUIDE_ITEMS";

    @NotNull
    private static final String f = "GUIDE_ITEMS_KEY";
    private static final int g = 100;
    private static final int h = 6;

    @NotNull
    private static final String i = "ACTIVE_DEVICE";

    @NotNull
    private static final String k = "supportAlexaMultilingual";

    @NotNull
    private static final String l = "alexa_endPoint";
    private static volatile SharedPreferences m;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<String> j = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b.\u0010\"J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006J\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u000eJ\u0017\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007R\u001d\u0010\u001a\u001a\u00020\u00078B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\f\n\u0004\b \u0010\u001c\u0012\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0016\u0010$\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0016\u0010%\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010\u001cR\u0016\u0010&\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010\u001cR\u0016\u0010'\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b'\u0010\u001fR\u0016\u0010(\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b(\u0010\u001cR\u0016\u0010)\u001a\u00020\u00078\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010\u001cR\u0016\u0010*\u001a\u00020\u001d8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b*\u0010\u001fR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/huami/ai/helper/SpeechKeeper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", PointCategory.INIT, "", "", "guides", "saveGuide", "speechGuide", "items", "saveGuideItems", "getGuideItems", "", "supportAlexaMultilingualLocal", "support", "saveSupportAlexaMultilingualLocal", "(Ljava/lang/Boolean;)V", "endPoint", "saveAlexaEndPoint", "alexaEndPoint", "timestamp$delegate", "Lkotlin/Lazy;", "b", "()Ljava/lang/String;", "timestamp", "ALEXA_ENDPOINT", "Ljava/lang/String;", "", "ITEM_SIZE", LogUtil.I, "KEY_ACTIVE_DEVICE", "getKEY_ACTIVE_DEVICE$annotations", "()V", "KEY_GUIDE_PREFIX", "KEY_GUIDE_SIZE", "KEY_GUIDE_TODAY_HISTORY_ITEMS_PREFIX", "KEY_LAST_GUIDE_HISTORY_KEY_NAME", "MAX_GUIDE_SIZE", "SP_NAME", "SUPPORT_ALEXA_MULTILINGUAL", "TODAY_MAX_GUIDE_ITEMS", "Landroid/content/SharedPreferences;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "speech-skill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ KProperty<Object>[] a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(Companion.class), "timestamp", "getTimestamp()Ljava/lang/String;"))};

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "speech guide empty";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private static /* synthetic */ void a() {
        }

        private final String b() {
            return (String) SpeechKeeper.j.getValue();
        }

        @Nullable
        public final String alexaEndPoint() {
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            return sharedPreferences.getString(SpeechKeeper.l, null);
        }

        @NotNull
        public final String getGuideItems() {
            String strStringPlus = Intrinsics.stringPlus(SpeechKeeper.e, b());
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            String string = sharedPreferences.getString(strStringPlus, "");
            return string == null ? "" : string;
        }

        public final void init(@NotNull Context context) {
            if (SpeechKeeper.m != null) {
                return;
            }
            SpeechKeeper.m = context.getSharedPreferences(SpeechKeeper.a, 0);
        }

        public final void saveAlexaEndPoint(@Nullable String endPoint) {
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (endPoint == null) {
                editorEdit.remove(SpeechKeeper.l);
            } else {
                editorEdit.putString(SpeechKeeper.l, endPoint);
            }
            editorEdit.apply();
        }

        public final void saveGuide(@NotNull List<String> guides) {
            if (guides.isEmpty()) {
                HMLog.info("speech", a.a);
                return;
            }
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            int i = 0;
            if (guides.size() > 3) {
                guides = guides.subList(0, 3);
            }
            editorEdit.putInt(SpeechKeeper.b, guides.size()).apply();
            Iterator<String> it2 = guides.iterator();
            while (it2.hasNext()) {
                editorEdit.putString(Intrinsics.stringPlus(SpeechKeeper.c, Integer.valueOf(i)), it2.next());
                i++;
            }
            editorEdit.apply();
        }

        public final void saveGuideItems(@NotNull String items) {
            String strStringPlus = Intrinsics.stringPlus(SpeechKeeper.e, b());
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            String string = sharedPreferences.getString(strStringPlus, null);
            if (string == null || string.length() == 0) {
                SharedPreferences sharedPreferences2 = SpeechKeeper.m;
                Objects.requireNonNull(sharedPreferences2);
                String string2 = sharedPreferences2.getString(SpeechKeeper.f, null);
                SharedPreferences sharedPreferences3 = SpeechKeeper.m;
                Objects.requireNonNull(sharedPreferences3);
                SharedPreferences.Editor editorEdit = sharedPreferences3.edit();
                if (string2 != null) {
                    editorEdit.remove(string2);
                }
                editorEdit.putString(SpeechKeeper.f, strStringPlus);
                editorEdit.apply();
            } else {
                items = StringsKt___StringsKt.takeLast(Intrinsics.stringPlus(string, items), 600);
            }
            SharedPreferences sharedPreferences4 = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences4);
            sharedPreferences4.edit().putString(strStringPlus, items).apply();
        }

        public final void saveSupportAlexaMultilingualLocal(@Nullable Boolean support) {
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            if (support == null) {
                editorEdit.remove(SpeechKeeper.k);
            } else {
                editorEdit.putBoolean(SpeechKeeper.k, support.booleanValue());
            }
            editorEdit.apply();
        }

        @Nullable
        public final List<String> speechGuide() {
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            int i = 0;
            int i2 = sharedPreferences.getInt(SpeechKeeper.b, 0);
            if (i2 == 0) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (i2 > 0) {
                while (true) {
                    int i3 = i + 1;
                    arrayList.add(sharedPreferences.getString(Intrinsics.stringPlus(SpeechKeeper.c, Integer.valueOf(i)), ""));
                    if (i3 >= i2) {
                        break;
                    }
                    i = i3;
                }
            }
            return arrayList;
        }

        public final boolean supportAlexaMultilingualLocal() {
            SharedPreferences sharedPreferences = SpeechKeeper.m;
            Objects.requireNonNull(sharedPreferences);
            return sharedPreferences.getBoolean(SpeechKeeper.k, false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, d2 = {"", "kotlin.jvm.PlatformType", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(new Date());
        }
    }
}
