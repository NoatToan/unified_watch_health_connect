package org.acra.attachment;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import org.acra.ACRA;
import org.acra.config.CoreConfiguration;

/* JADX INFO: loaded from: classes23.dex */
public class DefaultAttachmentProvider implements AttachmentUriProvider {
    @Override // org.acra.attachment.AttachmentUriProvider
    @NonNull
    public List<Uri> getAttachments(@NonNull Context context, @NonNull CoreConfiguration coreConfiguration) {
        ArrayList arrayList = new ArrayList();
        for (String str : coreConfiguration.attachmentUris()) {
            try {
                arrayList.add(Uri.parse(str));
            } catch (Exception e) {
                ACRA.log.e(ACRA.LOG_TAG, "Failed to parse Uri " + str, e);
            }
        }
        return arrayList;
    }
}
