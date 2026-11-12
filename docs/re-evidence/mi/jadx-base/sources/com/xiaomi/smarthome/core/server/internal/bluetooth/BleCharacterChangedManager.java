package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.RemoteException;
import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes10.dex */
public class BleCharacterChangedManager {
    private static Map<String, List<CharacterRecord>> mCharacterMaps = new ConcurrentHashMap();
    private static CharacterChangedReceiver mReceiver;

    public static class CharacterChangedReceiver extends BroadcastReceiver {
        private CharacterChangedReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            List<CharacterRecord> list;
            if ("com.xiaomi.smarthome.bluetooth.character_changed".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("key_device_address");
                UUID uuid = (UUID) intent.getSerializableExtra("key_service_uuid");
                UUID uuid2 = (UUID) intent.getSerializableExtra("key_character_uuid");
                byte[] byteArrayExtra = intent.getByteArrayExtra("key_character_value");
                if (stringExtra == null || uuid == null || uuid2 == null || byteArrayExtra == null || (list = (List) BleCharacterChangedManager.mCharacterMaps.get(stringExtra)) == null || list.size() <= 0) {
                    return;
                }
                for (CharacterRecord characterRecord : list) {
                    if (uuid.equals(characterRecord.service) && uuid2.equals(characterRecord.character)) {
                        BluetoothService.getBleCoreProvider().onBleCharacterChanged(stringExtra, uuid, uuid2, byteArrayExtra);
                        return;
                    }
                }
            }
        }
    }

    public static class CharacterRecord {
        protected UUID character;
        protected UUID service;

        public CharacterRecord(UUID uuid, UUID uuid2) {
            this.service = uuid;
            this.character = uuid2;
        }
    }

    private static boolean hasSameRecord(List<CharacterRecord> list, CharacterRecord characterRecord) {
        if (list != null && list.size() != 0 && characterRecord != null) {
            for (CharacterRecord characterRecord2 : list) {
                if (characterRecord.service.equals(characterRecord2.service) && characterRecord.character.equals(characterRecord2.character)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static synchronized void registerCharacterChanged(String str, UUID uuid, UUID uuid2, IBleResponse iBleResponse) {
        try {
            if (TextUtils.isEmpty(str) || uuid == null || uuid2 == null) {
                if (iBleResponse != null) {
                    try {
                        iBleResponse.onResponse(-1, null);
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
                return;
            }
            List<CharacterRecord> list = mCharacterMaps.get(str);
            CharacterRecord characterRecord = new CharacterRecord(uuid, uuid2);
            if (list == null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(characterRecord);
                mCharacterMaps.put(str, arrayList);
            } else if (!hasSameRecord(list, characterRecord)) {
                list.add(characterRecord);
            }
            if (mCharacterMaps.size() > 0) {
                registerReceiver();
            }
            if (iBleResponse != null) {
                try {
                    iBleResponse.onResponse(0, null);
                } catch (RemoteException e2) {
                    e2.printStackTrace();
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    private static synchronized void registerReceiver() {
        if (mReceiver == null) {
            mReceiver = new CharacterChangedReceiver();
            BluetoothUtils.registerReceiver(mReceiver, new IntentFilter("com.xiaomi.smarthome.bluetooth.character_changed"));
        }
    }

    public static synchronized void unregisterCharacterChanged(String str, UUID uuid, UUID uuid2) {
        try {
            List<CharacterRecord> list = mCharacterMaps.get(str);
            if (list != null) {
                Iterator<CharacterRecord> it = list.iterator();
                while (it.hasNext()) {
                    CharacterRecord next = it.next();
                    if (next.service.equals(uuid) && next.character.equals(uuid2)) {
                        it.remove();
                    }
                }
                if (list.size() == 0) {
                    mCharacterMaps.remove(str);
                }
            }
            if (mCharacterMaps.size() == 0) {
                unregisterReceiver();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private static synchronized void unregisterReceiver() {
        CharacterChangedReceiver characterChangedReceiver = mReceiver;
        if (characterChangedReceiver != null) {
            BluetoothUtils.unregisterReceiver(characterChangedReceiver);
            mReceiver = null;
        }
    }
}
