package com.miui.tsmclient.nfc;

import android.content.Context;
import android.nfc.NfcAdapter;
import com.miui.tsmclient.util.LogUtils;
import com.miui.tsmclient.util.ReflectUtil;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes6.dex */
public class NfcAdapterWrapper {
    private static final String DISABLE = "disable";
    private static final String DISABLE_NDEF_PUSH = "disableNdefPush";
    private static final String ENABLE = "enable";
    private NfcAdapter mNfcAdapter;

    public NfcAdapterWrapper(Context context) {
        this.mNfcAdapter = NfcAdapter.getDefaultAdapter(context);
    }

    public boolean disable() {
        NfcAdapter nfcAdapter = this.mNfcAdapter;
        if (nfcAdapter == null) {
            return false;
        }
        try {
            return ((Boolean) ReflectUtil.callObjectMethod(nfcAdapter, DISABLE, null, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtils.e("NfcAdapterWrapper disable", e);
            return false;
        }
    }

    public boolean disableNdefPush() {
        NfcAdapter nfcAdapter = this.mNfcAdapter;
        if (nfcAdapter == null) {
            return false;
        }
        try {
            return ((Boolean) ReflectUtil.callObjectMethod(nfcAdapter, DISABLE_NDEF_PUSH, null, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtils.e("NfcAdapterWrapper disableNdefPush", e);
            return false;
        }
    }

    public boolean enable() {
        NfcAdapter nfcAdapter = this.mNfcAdapter;
        if (nfcAdapter == null) {
            return false;
        }
        try {
            return ((Boolean) ReflectUtil.callObjectMethod(nfcAdapter, "enable", null, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            LogUtils.e("NfcAdapterWrapper enable", e);
            return false;
        }
    }
}
