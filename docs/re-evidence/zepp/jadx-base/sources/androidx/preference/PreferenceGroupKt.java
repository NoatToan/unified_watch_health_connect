package androidx.preference;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.Sequence;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010)\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\n¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0015\u0010\u0005\u001a\u00020\u0000*\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\n*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002\u001a\u0015\u0010\r\u001a\u00020\f*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0086\n\u001a\u0015\u0010\u000e\u001a\u00020\f*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0000H\u0086\n\u001a\r\u0010\u000f\u001a\u00020\n*\u00020\u0002H\u0086\b\u001a\r\u0010\u0010\u001a\u00020\n*\u00020\u0002H\u0086\b\u001a0\u0010\u0015\u001a\u00020\f*\u00020\u00022!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0\u0011H\u0086\b\u001aE\u0010\u0017\u001a\u00020\f*\u00020\u000226\u0010\u0014\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\f0\u0016H\u0086\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u0018*\u00020\u0002H\u0086\u0002\"\u0018\u0010\u001c\u001a\u00020\u0007*\u00020\u00028Æ\u0002@\u0006¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001d*\u00020\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Landroidx/preference/Preference;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/preference/PreferenceGroup;", "", "key", "get", "(Landroidx/preference/PreferenceGroup;Ljava/lang/CharSequence;)Landroidx/preference/Preference;", "", "index", "preference", "", SearchCriteria.CONTAINS, "", "plusAssign", "minusAssign", "isEmpty", "isNotEmpty", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "action", "forEach", "Lkotlin/Function2;", "forEachIndexed", "", "iterator", "getSize", "(Landroidx/preference/PreferenceGroup;)I", "size", "Lkotlin/sequences/Sequence;", "getChildren", "(Landroidx/preference/PreferenceGroup;)Lkotlin/sequences/Sequence;", "children", "preference-ktx_release"}, k = 2, mv = {1, 4, 0})
public final class PreferenceGroupKt {

    /* JADX INFO: renamed from: androidx.preference.PreferenceGroupKt$iterator$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/preference/PreferenceGroupKt$iterator$1", "", "Landroidx/preference/Preference;", "", "hasNext", "next", "", "remove", "", "index", LogUtil.I, "preference-ktx_release"}, k = 1, mv = {1, 4, 0})
    public static final class AnonymousClass1 implements Iterator<Preference>, KMutableIterator {
        public final /* synthetic */ PreferenceGroup $this_iterator;
        private int index;

        public AnonymousClass1(PreferenceGroup preferenceGroup) {
            this.$this_iterator = preferenceGroup;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.index < this.$this_iterator.getPreferenceCount();
        }

        @Override // java.util.Iterator
        public void remove() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index - 1;
            this.index = i;
            preferenceGroup.removePreference(preferenceGroup.getPreference(i));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @NotNull
        public Preference next() {
            PreferenceGroup preferenceGroup = this.$this_iterator;
            int i = this.index;
            this.index = i + 1;
            Preference preference = preferenceGroup.getPreference(i);
            if (preference != null) {
                return preference;
            }
            throw new IndexOutOfBoundsException();
        }
    }

    public static final boolean contains(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            if (Intrinsics.areEqual(preferenceGroup.getPreference(i), preference)) {
                return true;
            }
        }
        return false;
    }

    public static final void forEach(@NotNull PreferenceGroup preferenceGroup, @NotNull Function1<? super Preference, Unit> function1) {
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            function1.invoke(get(preferenceGroup, i));
        }
    }

    public static final void forEachIndexed(@NotNull PreferenceGroup preferenceGroup, @NotNull Function2<? super Integer, ? super Preference, Unit> function2) {
        int preferenceCount = preferenceGroup.getPreferenceCount();
        for (int i = 0; i < preferenceCount; i++) {
            function2.invoke(Integer.valueOf(i), get(preferenceGroup, i));
        }
    }

    @Nullable
    public static final <T extends Preference> T get(@NotNull PreferenceGroup preferenceGroup, @NotNull CharSequence charSequence) {
        return (T) preferenceGroup.findPreference(charSequence);
    }

    @NotNull
    public static final Sequence<Preference> getChildren(@NotNull final PreferenceGroup preferenceGroup) {
        return new Sequence<Preference>() { // from class: androidx.preference.PreferenceGroupKt$children$1
            @Override // kotlin.sequences.Sequence
            @NotNull
            public Iterator<Preference> iterator() {
                return PreferenceGroupKt.iterator(preferenceGroup);
            }
        };
    }

    public static final int getSize(@NotNull PreferenceGroup preferenceGroup) {
        return preferenceGroup.getPreferenceCount();
    }

    public static final boolean isEmpty(@NotNull PreferenceGroup preferenceGroup) {
        return preferenceGroup.getPreferenceCount() == 0;
    }

    public static final boolean isNotEmpty(@NotNull PreferenceGroup preferenceGroup) {
        return preferenceGroup.getPreferenceCount() != 0;
    }

    @NotNull
    public static final Iterator<Preference> iterator(@NotNull PreferenceGroup preferenceGroup) {
        return new AnonymousClass1(preferenceGroup);
    }

    public static final void minusAssign(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        preferenceGroup.removePreference(preference);
    }

    public static final void plusAssign(@NotNull PreferenceGroup preferenceGroup, @NotNull Preference preference) {
        preferenceGroup.addPreference(preference);
    }

    @NotNull
    public static final Preference get(@NotNull PreferenceGroup preferenceGroup, int i) {
        Preference preference = preferenceGroup.getPreference(i);
        if (preference != null) {
            return preference;
        }
        throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + preferenceGroup.getPreferenceCount());
    }
}
