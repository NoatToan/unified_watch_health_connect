package com.huami.prelaunch;

import android.content.SharedPreferences;
import com.huami.moving.ui.utils.SportAnalytics;
import com.huami.prelaunch.elements.Entry;
import com.huami.prelaunch.elements.Picture;
import com.huami.prelaunch.elements.Text;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\f\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006H\u0007J\b\u0010\u0012\u001a\u00020\u0002H\u0007J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\rR\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006 "}, d2 = {"Lcom/huami/prelaunch/PreLaunchCache;", "", "", "a", "Lcom/huami/prelaunch/elements/Text;", "text", "", "getText", "Lcom/huami/prelaunch/elements/Entry;", "entry", "", "state", "setEntryState", "Lcom/huami/prelaunch/elements/Picture;", SportAnalytics.ParamKey.PIC, "url", "setPicture", "setText", "clear", "getPicture", "Ljava/lang/String;", "KEEP_XML", "Landroid/content/SharedPreferences;", "b", "Landroid/content/SharedPreferences;", "getSp", "()Landroid/content/SharedPreferences;", "setSp", "(Landroid/content/SharedPreferences;)V", "sp", "<init>", "()V", "prelaunch_release"}, k = 1, mv = {1, 4, 0})
public final class PreLaunchCache {
    public static final PreLaunchCache INSTANCE = new PreLaunchCache();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String KEEP_XML = "PreLaunchCache";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private static SharedPreferences sp = PreLaunchApi.INSTANCE.getSContext().getSharedPreferences(KEEP_XML, 0);

    private PreLaunchCache() {
    }

    private final void a() {
        if (sp == null) {
            sp = PreLaunchApi.INSTANCE.getSContext().getSharedPreferences(KEEP_XML, 0);
        }
    }

    @JvmStatic
    public static final void clear() {
        SharedPreferences.Editor editorEdit;
        SharedPreferences.Editor editorClear;
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null || (editorClear = editorEdit.clear()) == null) {
            return;
        }
        editorClear.apply();
    }

    @JvmStatic
    @Nullable
    public static final String getText(@NotNull Text text) {
        INSTANCE.a();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(text.getTextTag(), null);
        }
        return null;
    }

    @JvmStatic
    public static final void setEntryState(@NotNull Entry entry, boolean state) {
        INSTANCE.a();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            if (sharedPreferences == null) {
                Intrinsics.throwNpe();
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putBoolean(entry.getEntryTag(), state);
            editorEdit.apply();
        }
    }

    @JvmStatic
    public static final void setPicture(@NotNull Picture pic, @NotNull String url) {
        INSTANCE.a();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            if (sharedPreferences == null) {
                Intrinsics.throwNpe();
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(pic.getPicTag(), url);
            editorEdit.apply();
        }
    }

    @JvmStatic
    public static final void setText(@NotNull Text text, @NotNull String url) {
        INSTANCE.a();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            if (sharedPreferences == null) {
                Intrinsics.throwNpe();
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(text.getTextTag(), url);
            editorEdit.apply();
        }
    }

    @Nullable
    public final String getPicture(@NotNull Picture pic) {
        a();
        SharedPreferences sharedPreferences = sp;
        if (sharedPreferences != null) {
            return sharedPreferences.getString(pic.getPicTag(), "");
        }
        return null;
    }

    @Nullable
    public final SharedPreferences getSp() {
        return sp;
    }

    public final void setSp(@Nullable SharedPreferences sharedPreferences) {
        sp = sharedPreferences;
    }
}
