package androidx.paging;

import com.miui.tsmclient.net.TSMAuthContants;
import defpackage.ghe;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ?\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher;", "", "T", "Landroidx/paging/NullPaddedList;", "oldList", "newList", "Lghe;", "callback", "Landroidx/paging/NullPaddedDiffResult;", "diffResult", "", "dispatchDiff", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;Lghe;Landroidx/paging/NullPaddedDiffResult;)V", "<init>", "()V", "PlaceholderUsingUpdateCallback", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
public final class OverlappingListsDiffDispatcher {

    @NotNull
    public static final OverlappingListsDiffDispatcher INSTANCE = new OverlappingListsDiffDispatcher();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000 +*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001+B+\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0010'\u001a\u00020\u0002¢\u0006\u0004\b)\u0010*J\u0014\u0010\u0004\u001a\u00020\u0003*\u00020\u0003H\u0082\b¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\bJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0016\u0010 \u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010!\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u001eR\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010'\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006,"}, d2 = {"Landroidx/paging/OverlappingListsDiffDispatcher$PlaceholderUsingUpdateCallback;", "T", "Lghe;", "", "offsetForDispatch", "(I)I", "", "fixTrailingPlaceholders", "()V", "fixLeadingPlaceholders", "position", "count", "", "dispatchInsertAsPlaceholderBefore", "(II)Z", "dispatchInsertAsPlaceholderAfter", "dispatchRemovalAsPlaceholdersBefore", "dispatchRemovalAsPlaceholdersAfter", "fixPlaceholders", "onInserted", "(II)V", "onRemoved", "fromPosition", "toPosition", "onMoved", "", TSMAuthContants.PARAM_PAYLOAD, "onChanged", "(IILjava/lang/Object;)V", "placeholdersBefore", "I", "placeholdersAfter", "storageCount", "placeholdersBeforeState", "placeholdersAfterState", "Landroidx/paging/NullPaddedList;", "oldList", "Landroidx/paging/NullPaddedList;", "newList", "callback", "Lghe;", "<init>", "(Landroidx/paging/NullPaddedList;Landroidx/paging/NullPaddedList;Lghe;)V", "Companion", "paging-runtime_release"}, k = 1, mv = {1, 4, 2})
    public static final class PlaceholderUsingUpdateCallback<T> implements ghe {
        private static final int UNUSED = 1;
        private static final int USED_FOR_ADDITION = 3;
        private static final int USED_FOR_REMOVAL = 2;
        private final ghe callback;
        private final NullPaddedList<T> newList;
        private final NullPaddedList<T> oldList;
        private int placeholdersAfter;
        private int placeholdersAfterState;
        private int placeholdersBefore;
        private int placeholdersBeforeState;
        private int storageCount;

        public PlaceholderUsingUpdateCallback(@NotNull NullPaddedList<T> oldList, @NotNull NullPaddedList<T> newList, @NotNull ghe callback) {
            Intrinsics.checkNotNullParameter(oldList, "oldList");
            Intrinsics.checkNotNullParameter(newList, "newList");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.oldList = oldList;
            this.newList = newList;
            this.callback = callback;
            this.placeholdersBefore = oldList.getPlaceholdersBefore();
            this.placeholdersAfter = oldList.getPlaceholdersAfter();
            this.storageCount = oldList.getStorageCount();
            this.placeholdersBeforeState = 1;
            this.placeholdersAfterState = 1;
        }

        private final boolean dispatchInsertAsPlaceholderAfter(int position, int count) {
            if (position < this.storageCount || this.placeholdersAfterState == 2) {
                return false;
            }
            int iMin = Math.min(count, this.placeholdersAfter);
            if (iMin > 0) {
                this.placeholdersAfterState = 3;
                this.callback.onChanged(this.placeholdersBefore + position, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersAfter -= iMin;
            }
            int i = count - iMin;
            if (i <= 0) {
                return true;
            }
            this.callback.onInserted(position + iMin + this.placeholdersBefore, i);
            return true;
        }

        private final boolean dispatchInsertAsPlaceholderBefore(int position, int count) {
            if (position > 0 || this.placeholdersBeforeState == 2) {
                return false;
            }
            int iMin = Math.min(count, this.placeholdersBefore);
            if (iMin > 0) {
                this.placeholdersBeforeState = 3;
                this.callback.onChanged((0 - iMin) + this.placeholdersBefore, iMin, DiffingChangePayload.PLACEHOLDER_TO_ITEM);
                this.placeholdersBefore -= iMin;
            }
            int i = count - iMin;
            if (i <= 0) {
                return true;
            }
            this.callback.onInserted(this.placeholdersBefore, i);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersAfter(int position, int count) {
            if (position + count < this.storageCount || this.placeholdersAfterState == 3) {
                return false;
            }
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.min(this.newList.getPlaceholdersAfter() - this.placeholdersAfter, count), 0);
            int i = count - iCoerceAtLeast;
            if (iCoerceAtLeast > 0) {
                this.placeholdersAfterState = 2;
                this.callback.onChanged(this.placeholdersBefore + position, iCoerceAtLeast, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
                this.placeholdersAfter += iCoerceAtLeast;
            }
            if (i <= 0) {
                return true;
            }
            this.callback.onRemoved(position + iCoerceAtLeast + this.placeholdersBefore, i);
            return true;
        }

        private final boolean dispatchRemovalAsPlaceholdersBefore(int position, int count) {
            if (position > 0 || this.placeholdersBeforeState == 3) {
                return false;
            }
            int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.min(this.newList.getPlaceholdersBefore() - this.placeholdersBefore, count), 0);
            int i = count - iCoerceAtLeast;
            if (i > 0) {
                this.callback.onRemoved(this.placeholdersBefore, i);
            }
            if (iCoerceAtLeast <= 0) {
                return true;
            }
            this.placeholdersBeforeState = 2;
            this.callback.onChanged(this.placeholdersBefore, iCoerceAtLeast, DiffingChangePayload.ITEM_TO_PLACEHOLDER);
            this.placeholdersBefore += iCoerceAtLeast;
            return true;
        }

        private final void fixLeadingPlaceholders() {
            int iMin = Math.min(this.oldList.getPlaceholdersBefore(), this.placeholdersBefore);
            int placeholdersBefore = this.newList.getPlaceholdersBefore() - this.placeholdersBefore;
            if (placeholdersBefore > 0) {
                if (iMin > 0) {
                    this.callback.onChanged(0, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
                this.callback.onInserted(0, placeholdersBefore);
            } else if (placeholdersBefore < 0) {
                this.callback.onRemoved(0, -placeholdersBefore);
                int i = iMin + placeholdersBefore;
                if (i > 0) {
                    this.callback.onChanged(0, i, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
                }
            }
            this.placeholdersBefore = this.newList.getPlaceholdersBefore();
        }

        private final void fixTrailingPlaceholders() {
            int iMin = Math.min(this.oldList.getPlaceholdersAfter(), this.placeholdersAfter);
            int placeholdersAfter = this.newList.getPlaceholdersAfter();
            int i = this.placeholdersAfter;
            int i2 = placeholdersAfter - i;
            int i3 = this.placeholdersBefore + this.storageCount + i;
            int i4 = i3 - iMin;
            boolean z = i4 != this.oldList.getSize() - iMin;
            if (i2 > 0) {
                this.callback.onInserted(i3, i2);
            } else if (i2 < 0) {
                this.callback.onRemoved(i3 + i2, -i2);
                iMin += i2;
            }
            if (iMin > 0 && z) {
                this.callback.onChanged(i4, iMin, DiffingChangePayload.PLACEHOLDER_POSITION_CHANGE);
            }
            this.placeholdersAfter = this.newList.getPlaceholdersAfter();
        }

        private final int offsetForDispatch(int i) {
            return i + this.placeholdersBefore;
        }

        public final void fixPlaceholders() {
            fixLeadingPlaceholders();
            fixTrailingPlaceholders();
        }

        @Override // defpackage.ghe
        public void onChanged(int position, int count, @Nullable Object payload) {
            this.callback.onChanged(position + this.placeholdersBefore, count, payload);
        }

        @Override // defpackage.ghe
        public void onInserted(int position, int count) {
            if (!dispatchInsertAsPlaceholderAfter(position, count) && !dispatchInsertAsPlaceholderBefore(position, count)) {
                this.callback.onInserted(position + this.placeholdersBefore, count);
            }
            this.storageCount += count;
        }

        @Override // defpackage.ghe
        public void onMoved(int fromPosition, int toPosition) {
            this.callback.onMoved(fromPosition + this.placeholdersBefore, toPosition + this.placeholdersBefore);
        }

        @Override // defpackage.ghe
        public void onRemoved(int position, int count) {
            if (!dispatchRemovalAsPlaceholdersAfter(position, count) && !dispatchRemovalAsPlaceholdersBefore(position, count)) {
                this.callback.onRemoved(position + this.placeholdersBefore, count);
            }
            this.storageCount -= count;
        }
    }

    private OverlappingListsDiffDispatcher() {
    }

    public final <T> void dispatchDiff(@NotNull NullPaddedList<T> oldList, @NotNull NullPaddedList<T> newList, @NotNull ghe callback, @NotNull NullPaddedDiffResult diffResult) {
        Intrinsics.checkNotNullParameter(oldList, "oldList");
        Intrinsics.checkNotNullParameter(newList, "newList");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(diffResult, "diffResult");
        PlaceholderUsingUpdateCallback placeholderUsingUpdateCallback = new PlaceholderUsingUpdateCallback(oldList, newList, callback);
        diffResult.getDiff().c(placeholderUsingUpdateCallback);
        placeholderUsingUpdateCallback.fixPlaceholders();
    }
}
