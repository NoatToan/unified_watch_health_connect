package com.huami.thirdparty.support.viewbinding;

import androidx.annotation.MainThread;
import androidx.exifinterface.media.ExifInterface;
import androidx.viewbinding.ViewBinding;
import kotlin.Metadata;
import kotlin.properties.ReadOnlyProperty;

/* JADX INFO: loaded from: classes14.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0000*\u00020\u0001*\b\b\u0001\u0010\u0004*\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005J\b\u0010\u0007\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/huami/thirdparty/support/viewbinding/ViewBindingProperty;", "", "R", "Landroidx/viewbinding/ViewBinding;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/properties/ReadOnlyProperty;", "", "clear", "support_release"}, k = 1, mv = {1, 5, 1})
public interface ViewBindingProperty<R, T extends ViewBinding> extends ReadOnlyProperty<R, T> {
    @MainThread
    void clear();
}
