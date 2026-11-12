package com.mapbox.common;

import android.content.SharedPreferences;
import ch.qos.logback.core.joran.action.Action;
import com.mapbox.bindgen.Expected;
import com.mapbox.bindgen.ExpectedFactory;
import com.mapbox.bindgen.None;
import java.util.List;
import o13.l;
import o13.m;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.w;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mapbox/common/SettingsServiceHelper;", "", "()V", "Companion", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SettingsServiceHelper {
    private static final String MAPBOX_PREFERENCES_NAME = "mapbox_settings";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final l<SharedPreferences> preferences$delegate = m.b(SettingsServiceHelper$Companion$preferences$2.INSTANCE);

    public static final Expected<String, None> erase(String str) {
        return INSTANCE.erase(str);
    }

    public static final Expected<String, String> get(String str) {
        return INSTANCE.get(str);
    }

    public static final boolean has(String str) {
        return INSTANCE.has(str);
    }

    public static final Expected<String, List<String>> set(String str, String str2) {
        return INSTANCE.set(str, str2);
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003J3\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b0\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\rJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00100\n2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/mapbox/common/SettingsServiceHelper$Companion;", "", "<init>", "()V", "", "clear$common_release", "clear", "", Action.KEY_ATTRIBUTE, "value", "Lcom/mapbox/bindgen/Expected;", "", "set", "(Ljava/lang/String;Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "get", "(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;", "Lcom/mapbox/bindgen/None;", "erase", "", "has", "(Ljava/lang/String;)Z", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences$delegate", "Lo13/l;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "MAPBOX_PREFERENCES_NAME", "Ljava/lang/String;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final SharedPreferences getPreferences() {
            return (SharedPreferences) SettingsServiceHelper.preferences$delegate.getValue();
        }

        public final void clear$common_release() {
            SharedPreferences.Editor editorEdit = getPreferences().edit();
            editorEdit.clear();
            editorEdit.apply();
        }

        public final Expected<String, None> erase(String key) {
            key.getClass();
            try {
                SharedPreferences.Editor editorEdit = getPreferences().edit();
                editorEdit.remove(key);
                editorEdit.apply();
                Expected<String, None> expectedCreateNone = ExpectedFactory.createNone();
                expectedCreateNone.getClass();
                return expectedCreateNone;
            } catch (Exception e4) {
                String message = e4.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, None> expectedCreateError = ExpectedFactory.createError(message);
                expectedCreateError.getClass();
                return expectedCreateError;
            }
        }

        public final Expected<String, String> get(String key) {
            key.getClass();
            try {
                String string = getPreferences().getString(key, null);
                Expected<String, String> expectedCreateValue = string != null ? ExpectedFactory.createValue(string) : null;
                if (expectedCreateValue != null) {
                    return expectedCreateValue;
                }
                Expected<String, String> expectedCreateError = ExpectedFactory.createError("Key is not found");
                expectedCreateError.getClass();
                return expectedCreateError;
            } catch (ClassCastException e4) {
                StringBuilder sbL = hb.a.l("Unable to get a value for ", key, ": ");
                sbL.append(e4.getMessage());
                String string2 = sbL.toString();
                Log.error(string2, "settings");
                Expected<String, String> expectedCreateError2 = ExpectedFactory.createError(string2);
                expectedCreateError2.getClass();
                return expectedCreateError2;
            } catch (Exception e14) {
                String message = e14.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, String> expectedCreateError3 = ExpectedFactory.createError(message);
                expectedCreateError3.getClass();
                return expectedCreateError3;
            }
        }

        public final boolean has(String key) {
            key.getClass();
            try {
                return getPreferences().contains(key);
            } catch (Exception unused) {
                return false;
            }
        }

        public final Expected<String, List<String>> set(String key, String value) {
            key.getClass();
            value.getClass();
            Expected<String, String> expected = get(key);
            if (expected.isError() && !s.g(expected.getError(), "Key is not found")) {
                String error = expected.getError();
                error.getClass();
                Expected<String, List<String>> expectedCreateError = ExpectedFactory.createError(error);
                expectedCreateError.getClass();
                return expectedCreateError;
            }
            if (expected.isValue() && s.g(expected.getValue(), value)) {
                Expected<String, List<String>> expectedCreateValue = ExpectedFactory.createValue(w.c(value));
                expectedCreateValue.getClass();
                return expectedCreateValue;
            }
            String value2 = expected.isValue() ? expected.getValue() : null;
            try {
                SharedPreferences.Editor editorEdit = getPreferences().edit();
                editorEdit.putString(key, value);
                editorEdit.apply();
                Expected<String, List<String>> expectedCreateValue2 = ExpectedFactory.createValue(w.c(value2));
                expectedCreateValue2.getClass();
                return expectedCreateValue2;
            } catch (Exception e4) {
                String message = e4.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                Expected<String, List<String>> expectedCreateError2 = ExpectedFactory.createError(message);
                expectedCreateError2.getClass();
                return expectedCreateError2;
            }
        }

        private Companion() {
        }
    }
}
