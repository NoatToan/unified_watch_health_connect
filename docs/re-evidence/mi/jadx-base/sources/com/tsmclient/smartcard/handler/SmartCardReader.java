package com.tsmclient.smartcard.handler;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.handler.config.ConfigCardHandler;
import com.tsmclient.smartcard.model.ConfigRules;
import com.tsmclient.smartcard.terminal.IScTerminal;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class SmartCardReader extends TagReader {
    public SmartCardReader(Activity activity) {
        this(activity, null, null);
    }

    private static Bundle doReadCard(IScTerminal iScTerminal, String str, Context context, Bundle bundle) throws UnProcessableCardException, IOException {
        if (iScTerminal == null) {
            throw new UnProcessableCardException("IScTerminal is null");
        }
        ISmartCardHandler handler = getHandler(context, str, bundle);
        if (handler == null) {
            throw new UnProcessableCardException("No matched handler");
        }
        try {
            try {
                iScTerminal.open();
                Bundle bundleOnHandleCard = handler.onHandleCard(iScTerminal, bundle);
                iScTerminal.close();
                return bundleOnHandleCard;
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new IOException("read card is interrupted");
            }
        } catch (Throwable th) {
            iScTerminal.close();
            throw th;
        }
    }

    private static ISmartCardHandler getHandler(Context context, String str, Bundle bundle) {
        if (bundle != null && bundle.containsKey(ISmartCardHandler.KEY_READ_CARD_OPTION_RULES)) {
            return new ConfigCardHandler(str, (ConfigRules) bundle.getParcelable(ISmartCardHandler.KEY_READ_CARD_OPTION_RULES));
        }
        if (TextUtils.equals(str, "SZT")) {
            return new SZTCardHandler();
        }
        if (TextUtils.equals(str, "SPTC") || TextUtils.equals(str, "SPTC_NEW")) {
            return new CityUCardHandler(str);
        }
        if (TextUtils.equals(str, "BMAC")) {
            return new BMACCardHandler();
        }
        if (TextUtils.equals(str, "LNT")) {
            return new LingNanCardHandler();
        }
        if (TextUtils.equals(str, CardConstants.BANK_CARD_ID)) {
            return new BankCardHandler();
        }
        if (TextUtils.equals(str, CardConstants.SUZHOUTONG)) {
            return new SuZhouTongCardHandler();
        }
        if (TextUtils.equals(str, CardConstants.WHT)) {
            return new WHTCardHandler();
        }
        if (TextUtils.equals(str, CardConstants.HZT)) {
            return new HZTCardHandler();
        }
        if (TextUtils.equals(str, CardConstants.CST)) {
            return new CSTCardHandler();
        }
        if (TextUtils.equals(str, "DCEPCARD")) {
            return new DCEPCardHandler();
        }
        return null;
    }

    public static Bundle readCard(IScTerminal iScTerminal, String str, Context context) {
        return readCard(iScTerminal, str, context, new Bundle());
    }

    public SmartCardReader(Activity activity, Handler handler, Handler handler2) {
        super(activity, handler, handler2);
    }

    public static Bundle readCard(IScTerminal iScTerminal, String str, Context context, Bundle bundle) {
        try {
            Bundle bundleDoReadCard = doReadCard(iScTerminal, str, context, bundle);
            StringBuilder sb = new StringBuilder();
            sb.append("readCard:");
            sb.append(str);
            sb.append(" success.");
            return bundleDoReadCard;
        } catch (UnProcessableCardException unused) {
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean("success", false);
            bundle2.putInt("error", 2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("readCard:");
            sb2.append(str);
            sb2.append(" occurred UnProcessableCardException.");
            return bundle2;
        } catch (IOException unused2) {
            Bundle bundle3 = new Bundle();
            bundle3.putBoolean("success", false);
            bundle3.putInt("error", 1);
            StringBuilder sb3 = new StringBuilder();
            sb3.append("readCard:");
            sb3.append(str);
            sb3.append(" occurred IOException.");
            return bundle3;
        } catch (Exception unused3) {
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean("success", false);
            bundle4.putInt("error", 3);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("readCard:");
            sb4.append(str);
            sb4.append(" occurred Exception.");
            return bundle4;
        }
    }
}
