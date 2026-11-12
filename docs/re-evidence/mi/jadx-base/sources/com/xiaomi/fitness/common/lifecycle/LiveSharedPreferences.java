package com.xiaomi.fitness.common.lifecycle;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import androidx.health.connect.client.records.CervicalMucusRecord;
import androidx.lifecycle.LiveData;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mibi.sdk.component.Constants;
import com.xiaomi.fitness.common.handler.IJobHandler;
import defpackage.jrd;
import defpackage.n6r;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u000212B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\nJ\u0012\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u0012H\u0016J\u001c\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\tH\u0016J(\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017H\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020 H\u0016J\u0011\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010(\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\u0018\u0010)\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\t\u0012\u0002\b\u00030\u00120*H\u0016J\u001e\u0010+\u001a\b\u0012\u0004\u0012\u00020\t0*2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0016J.\u0010,\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00170*2\u0006\u0010\u0014\u001a\u00020\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0017H\u0016J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001a0*2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001aH\u0016J\u001e\u0010.\u001a\b\u0012\u0004\u0012\u00020\u001c0*2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001cH\u0016J\u001e\u0010/\u001a\b\u0012\u0004\u0012\u00020\u001e0*2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u001eH\u0016J\u001e\u00100\u001a\b\u0012\u0004\u0012\u00020 0*2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020 H\u0016R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\f\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences;", "Landroid/content/SharedPreferences;", "Lcom/xiaomi/fitness/common/lifecycle/ILiveSharedPreferences;", "preferences", "<init>", "(Landroid/content/SharedPreferences;)V", "context", "Landroid/content/Context;", "name", "", "(Landroid/content/Context;Ljava/lang/String;)V", "mPreferences", "mActiveDataMap", "", "Lcom/xiaomi/fitness/common/lifecycle/ComputableLiveData;", "mOnChangeListener", "Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences$OnChangeListener;", "getAll", "", "getString", "key", "defValue", "getStringSet", "", "defValues", "getInt", "", "getLong", "", "getFloat", "", "getBoolean", "", "contains", "edit", "Landroid/content/SharedPreferences$Editor;", "registerOnSharedPreferenceChangeListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "unregisterOnSharedPreferenceChangeListener", "reqAll", "Landroidx/lifecycle/LiveData;", "reqString", "reqStringSet", "reqInt", "reqLong", "reqFloat", "reqBoolean", "InnerEditor", "OnChangeListener", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LiveSharedPreferences implements SharedPreferences, ILiveSharedPreferences {

    @NotNull
    private final Map<String, ComputableLiveData<?>> mActiveDataMap;

    @NotNull
    private final OnChangeListener mOnChangeListener;

    @NotNull
    private final SharedPreferences mPreferences;

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B-\b\u0000\u0012\u0006\u0010#\u001a\u00020\u0001\u0012\u001a\u0010'\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010&0%¢\u0006\u0004\b+\u0010,J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0005J!\u0010\n\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010\u0005R\u0014\u0010#\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R(\u0010'\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010&0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences$InnerEditor;", "Landroid/content/SharedPreferences$Editor;", "Ljrd;", "", "notifyActiveDataIfNeed", "()V", "notifyActiveDataWhenClear", "", "key", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "", Constants.KEY_RECHARGE_VALUES, "putStringSet", "(Ljava/lang/String;Ljava/util/Set;)Landroid/content/SharedPreferences$Editor;", "", "putInt", "(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;", "", "putLong", "(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;", "", "putFloat", "(Ljava/lang/String;F)Landroid/content/SharedPreferences$Editor;", "", "putBoolean", "(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;", "remove", "(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", CervicalMucusRecord.Appearance.CLEAR, "()Landroid/content/SharedPreferences$Editor;", "commit", "()Z", "apply", "mEditor", "Landroid/content/SharedPreferences$Editor;", "", "Lcom/xiaomi/fitness/common/lifecycle/ComputableLiveData;", "mActiveDataMap", "Ljava/util/Map;", "mHasClear", "Z", "<init>", "(Landroid/content/SharedPreferences$Editor;Ljava/util/Map;)V", "common_release"}, k = 1, mv = {2, 0, 0})
    @SourceDebugExtension({"SMAP\nLiveSharedPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveSharedPreferences.kt\ncom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences$InnerEditor\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,269:1\n37#2:270\n36#2,3:271\n*S KotlinDebug\n*F\n+ 1 LiveSharedPreferences.kt\ncom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences$InnerEditor\n*L\n245#1:270\n245#1:271,3\n*E\n"})
    public static final class InnerEditor implements SharedPreferences.Editor, jrd {

        @NotNull
        private final Map<String, ComputableLiveData<?>> mActiveDataMap;

        @NotNull
        private final SharedPreferences.Editor mEditor;
        private boolean mHasClear;

        /* JADX WARN: Multi-variable type inference failed */
        public InnerEditor(@NotNull SharedPreferences.Editor mEditor, @NotNull Map<String, ? extends ComputableLiveData<?>> mActiveDataMap) {
            Intrinsics.checkNotNullParameter(mEditor, "mEditor");
            Intrinsics.checkNotNullParameter(mActiveDataMap, "mActiveDataMap");
            this.mEditor = mEditor;
            this.mActiveDataMap = mActiveDataMap;
        }

        private final void notifyActiveDataIfNeed() {
            if (this.mHasClear) {
                notifyActiveDataWhenClear();
            }
        }

        private final void notifyActiveDataWhenClear() {
            final ComputableLiveData[] computableLiveDataArr = (ComputableLiveData[]) this.mActiveDataMap.values().toArray(new ComputableLiveData[0]);
            if (computableLiveDataArr.length > 0) {
                getJobHandler(new Handler.Callback[0]).newJob().post(new Runnable() { // from class: com.xiaomi.fitness.common.lifecycle.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveSharedPreferences.InnerEditor.notifyActiveDataWhenClear$lambda$0(computableLiveDataArr);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void notifyActiveDataWhenClear$lambda$0(ComputableLiveData[] values) {
            Intrinsics.checkNotNullParameter(values, "$values");
            for (ComputableLiveData computableLiveData : values) {
                Intrinsics.checkNotNull(computableLiveData);
                computableLiveData.invalidate();
            }
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            this.mEditor.apply();
            notifyActiveDataIfNeed();
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor clear() {
            this.mHasClear = true;
            this.mEditor.clear();
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            boolean zCommit = this.mEditor.commit();
            if (zCommit) {
                notifyActiveDataIfNeed();
            }
            return zCommit;
        }

        @Override // defpackage.jrd
        public /* bridge */ /* synthetic */ IJobHandler getJobHandler(Handler.Callback... callbackArr) {
            return super.getJobHandler(callbackArr);
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putBoolean(@NotNull String key, boolean value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.putBoolean(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putFloat(@NotNull String key, float value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.putFloat(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putInt(@NotNull String key, int value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.putInt(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putLong(@NotNull String key, long value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.putLong(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putString(@NotNull String key, @Nullable String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.putString(key, value);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor putStringSet(@NotNull String key, @Nullable Set<String> values) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.putStringSet(key, values);
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        @NotNull
        public SharedPreferences.Editor remove(@NotNull String key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.mEditor.remove(key);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u001a\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016R\"\u0010\u0002\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xiaomi/fitness/common/lifecycle/LiveSharedPreferences$OnChangeListener;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "mActiveLiveDataMap", "", "", "Lcom/xiaomi/fitness/common/lifecycle/ComputableLiveData;", "<init>", "(Ljava/util/Map;)V", "onSharedPreferenceChanged", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "key", "common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class OnChangeListener implements SharedPreferences.OnSharedPreferenceChangeListener {

        @NotNull
        private final Map<String, ComputableLiveData<?>> mActiveLiveDataMap;

        /* JADX WARN: Multi-variable type inference failed */
        public OnChangeListener(@NotNull Map<String, ? extends ComputableLiveData<?>> mActiveLiveDataMap) {
            Intrinsics.checkNotNullParameter(mActiveLiveDataMap, "mActiveLiveDataMap");
            this.mActiveLiveDataMap = mActiveLiveDataMap;
        }

        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public void onSharedPreferenceChanged(@NotNull SharedPreferences sharedPreferences, @Nullable String key) {
            ComputableLiveData<?> computableLiveData;
            Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
            if (key == null || (computableLiveData = this.mActiveLiveDataMap.get(key)) == null) {
                return;
            }
            computableLiveData.invalidate();
        }
    }

    public LiveSharedPreferences(@NotNull SharedPreferences preferences) {
        Intrinsics.checkNotNullParameter(preferences, "preferences");
        Objects.requireNonNull(preferences);
        Intrinsics.checkNotNullExpressionValue(preferences, "requireNonNull(...)");
        SharedPreferences sharedPreferences = preferences;
        this.mPreferences = sharedPreferences;
        n6r n6rVar = new n6r();
        this.mActiveDataMap = n6rVar;
        OnChangeListener onChangeListener = new OnChangeListener(n6rVar);
        this.mOnChangeListener = onChangeListener;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onChangeListener);
    }

    @Override // android.content.SharedPreferences
    public boolean contains(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.contains(key);
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public SharedPreferences.Editor edit() {
        SharedPreferences.Editor editorEdit = this.mPreferences.edit();
        Intrinsics.checkNotNullExpressionValue(editorEdit, "edit(...)");
        return new InnerEditor(editorEdit, this.mActiveDataMap);
    }

    @Override // android.content.SharedPreferences
    @NotNull
    public Map<String, ?> getAll() {
        Map<String, ?> all = this.mPreferences.getAll();
        Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
        return all;
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(@NotNull String key, boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.getBoolean(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(@NotNull String key, float defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.getFloat(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public int getInt(@NotNull String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.getInt(key, defValue);
    }

    @Override // android.content.SharedPreferences
    public long getLong(@NotNull String key, long defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.getLong(key, defValue);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(@NotNull String key, @Nullable String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.getString(key, defValue);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(@NotNull String key, @Nullable Set<String> defValues) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.mPreferences.getStringSet(key, defValues);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPreferences.registerOnSharedPreferenceChangeListener(listener);
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<Map<String, ?>> reqAll() {
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get("all");
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<Map<String, ?>>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqAll.1
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public Map<String, ?> onCompute() {
                    Map<String, ?> all = LiveSharedPreferences.this.mPreferences.getAll();
                    Intrinsics.checkNotNullExpressionValue(all, "getAll(...)");
                    return all;
                }
            }, false, 2, null);
            this.mActiveDataMap.put("all", computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<Boolean> reqBoolean(@NotNull final String key, final boolean defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get(key);
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<Boolean>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqBoolean.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public Boolean onCompute() {
                    return Boolean.valueOf(LiveSharedPreferences.this.mPreferences.getBoolean(key, defValue));
                }
            }, false, 2, null);
            this.mActiveDataMap.put(key, computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<Float> reqFloat(@NotNull final String key, final float defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get(key);
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<Float>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqFloat.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public Float onCompute() {
                    return Float.valueOf(LiveSharedPreferences.this.mPreferences.getFloat(key, defValue));
                }
            }, false, 2, null);
            this.mActiveDataMap.put(key, computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<Integer> reqInt(@NotNull final String key, final int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get(key);
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<Integer>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqInt.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public Integer onCompute() {
                    return Integer.valueOf(LiveSharedPreferences.this.mPreferences.getInt(key, defValue));
                }
            }, false, 2, null);
            this.mActiveDataMap.put(key, computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<Long> reqLong(@NotNull final String key, final long defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get(key);
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<Long>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqLong.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public Long onCompute() {
                    return Long.valueOf(LiveSharedPreferences.this.mPreferences.getLong(key, defValue));
                }
            }, false, 2, null);
            this.mActiveDataMap.put(key, computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<String> reqString(@NotNull final String key, @NotNull final String defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defValue, "defValue");
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get(key);
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<String>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqString.1
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public String onCompute() {
                    String string = LiveSharedPreferences.this.mPreferences.getString(key, defValue);
                    Intrinsics.checkNotNull(string);
                    return string;
                }
            }, false, 2, null);
            this.mActiveDataMap.put(key, computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // com.xiaomi.fitness.common.lifecycle.ILiveSharedPreferences
    @NotNull
    public LiveData<Set<String>> reqStringSet(@NotNull final String key, @Nullable final Set<String> defValues) {
        Intrinsics.checkNotNullParameter(key, "key");
        ComputableLiveData<?> computableLiveData = this.mActiveDataMap.get(key);
        if (computableLiveData == null) {
            computableLiveData = new ComputableLiveData<>(new OnCompute<Set<? extends String>>() { // from class: com.xiaomi.fitness.common.lifecycle.LiveSharedPreferences.reqStringSet.1
                @Override // com.xiaomi.fitness.common.lifecycle.OnCompute
                public Set<? extends String> onCompute() {
                    return LiveSharedPreferences.this.mPreferences.getStringSet(key, defValues);
                }
            }, false, 2, null);
            this.mActiveDataMap.put(key, computableLiveData);
        }
        return computableLiveData.asLiveData();
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(@NotNull SharedPreferences.OnSharedPreferenceChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.mPreferences.unregisterOnSharedPreferenceChangeListener(listener);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public LiveSharedPreferences(@NotNull Context context, @NotNull String name) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        SharedPreferences sharedPreferences = context.getSharedPreferences(name, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this(sharedPreferences);
    }
}
