package com.garmin.device.filetransfer;

import com.garmin.proto.generated.GDIFileAccess;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B;\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/device/filetransfer/ItemListingException;", "Lcom/garmin/device/filetransfer/FileTransferException;", "", "Llk2/a;", FirebaseAnalytics.Param.ITEMS, "", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "Lcom/garmin/proto/generated/GDIFileAccess$ItemListResponse$Status;", "status", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/Exception;Lcom/garmin/proto/generated/GDIFileAccess$ItemListResponse$Status;)V", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lcom/garmin/proto/generated/GDIFileAccess$ItemListResponse$Status;", "getStatus", "()Lcom/garmin/proto/generated/GDIFileAccess$ItemListResponse$Status;", "file-transfer-device_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ItemListingException extends FileTransferException {
    private final List<lk2.a> items;
    private final GDIFileAccess.ItemListResponse.Status status;

    public /* synthetic */ ItemListingException(List list, String str, Exception exc, GDIFileAccess.ItemListResponse.Status status, int i14, j jVar) {
        this(list, str, (i14 & 4) != 0 ? null : exc, (i14 & 8) != 0 ? null : status);
    }

    public final List<lk2.a> getItems() {
        return this.items;
    }

    public final GDIFileAccess.ItemListResponse.Status getStatus() {
        return this.status;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ItemListingException(List<lk2.a> list, String str, Exception exc, GDIFileAccess.ItemListResponse.Status status) {
        super(str, exc);
        list.getClass();
        str.getClass();
        this.items = list;
        this.status = status;
    }
}
