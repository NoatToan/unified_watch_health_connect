package com.garmin.android.music;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
class GfdiMusicControlTransport implements IMusicControlTransport {
    private final MusicDataHandler dataHandler;

    public GfdiMusicControlTransport(MusicDataHandler musicDataHandler) {
        this.dataHandler = musicDataHandler;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    @Override // com.garmin.android.music.IMusicControlTransport
    public void sendEntityUpdate(String str, List<EntityUpdate> list, byte b14) throws IOException {
        ArrayList arrayList = new ArrayList(list.size());
        for (EntityUpdate entityUpdate : list) {
            int i14 = entityUpdate.entityId;
            boolean z14 = true;
            boolean z15 = false;
            if (i14 == 2) {
                z14 = (b14 & 1) != 0;
                if (z14 && entityUpdate.attributeId == 4) {
                    ih2.b.d("Not sending Album art due to protobuf size constraints.");
                } else {
                    z15 = z14;
                }
            } else if (i14 == 0) {
                int i15 = entityUpdate.attributeId;
                if (i15 == 0) {
                    if ((b14 & 8) == 0) {
                        z14 = false;
                    }
                    z15 = z14;
                } else if (i15 == 1) {
                    if ((b14 & 2) == 0) {
                        z14 = false;
                    }
                    z15 = z14;
                } else if (i15 == 2) {
                    if ((b14 & 4) == 0) {
                        z14 = false;
                    }
                    z15 = z14;
                }
            }
            if (z15) {
                arrayList.add(new AMSEntityUpdate((byte) entityUpdate.entityId, (byte) entityUpdate.attributeId, (byte) entityUpdate.entityUpdateFlags, entityUpdate.value));
            }
        }
        this.dataHandler.sendMediaEntityUpdate(arrayList);
    }
}
