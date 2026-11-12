package com.tsmclient.smartcard.handler;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.NfcF;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.tsmclient.smartcard.CardConstants;
import com.tsmclient.smartcard.exception.UnProcessableCardException;
import com.tsmclient.smartcard.util.PendingIntentUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes6.dex */
public class TagReader {
    protected static final String TAG = "SmartCardReader";
    private final Activity mActivity;
    private final ReentrantLock mExtraHandlerListLocker;
    private final List<ISmartCardHandler<IsoDep>> mExtraIsoDepHandlerList;
    private final List<ISmartCardHandler<NfcF>> mExtraNfcFHandlerList;
    private final Handler mHandler;
    private final List<ISmartCardHandler<IsoDep>> mIsoDepHandlerList;
    private SmartCardReaderListener mListener;
    private final List<ISmartCardHandler<MifareClassic>> mMifareClassicHandlerList;
    private final List<ISmartCardHandler<NfcF>> mNfcFHandlerList;
    private PendingIntent mPendingIntent;
    private boolean mPolling;
    private final AtomicBoolean mStop;
    private final Handler mWorkHandler;
    private HandlerThread mWorkThread;

    public interface SmartCardReaderListener {
        void onCompleteHandle(Bundle bundle);

        void onStartHandleTag();
    }

    public TagReader(Activity activity) {
        this(activity, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle handleIsoDep(IsoDep isoDep) throws IOException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", false);
        bundle.putInt("error", 2);
        try {
            try {
                isoDep.connect();
                for (ISmartCardHandler<IsoDep> iSmartCardHandler : this.mIsoDepHandlerList) {
                    try {
                        bundle = iSmartCardHandler.onHandleCard(isoDep);
                        StringBuilder sb = new StringBuilder();
                        sb.append("IsoDep is handled by handler:");
                        sb.append(iSmartCardHandler.getClass());
                        unLockExtraHandlerListLocker();
                        try {
                            isoDep.close();
                        } catch (IOException unused) {
                        }
                        return bundle;
                    } catch (UnProcessableCardException unused2) {
                    }
                }
                lockExtraHandlerListLocker();
                for (ISmartCardHandler<IsoDep> iSmartCardHandler2 : this.mExtraIsoDepHandlerList) {
                    try {
                        bundle = iSmartCardHandler2.onHandleCard(isoDep);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("IsoDep is handled by extra handler:");
                        sb2.append(iSmartCardHandler2.getClass());
                        unLockExtraHandlerListLocker();
                        try {
                            isoDep.close();
                        } catch (IOException unused3) {
                        }
                        return bundle;
                    } catch (UnProcessableCardException unused4) {
                    }
                }
            } catch (Throwable th) {
                unLockExtraHandlerListLocker();
                try {
                    isoDep.close();
                } catch (IOException unused5) {
                }
                throw th;
            }
        } catch (InterruptedException unused6) {
            Thread.currentThread().interrupt();
        }
        unLockExtraHandlerListLocker();
        try {
            isoDep.close();
        } catch (IOException unused7) {
        }
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle handleMifareClassic(MifareClassic mifareClassic) throws IOException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", false);
        bundle.putInt("error", 2);
        try {
            mifareClassic.connect();
            for (ISmartCardHandler<MifareClassic> iSmartCardHandler : this.mMifareClassicHandlerList) {
                try {
                    bundle = iSmartCardHandler.onHandleCard(mifareClassic);
                    StringBuilder sb = new StringBuilder();
                    sb.append("MifareClassic is handled by handler:");
                    sb.append(iSmartCardHandler.getClass());
                    return bundle;
                } catch (UnProcessableCardException unused) {
                }
            }
            return bundle;
        } finally {
            try {
                mifareClassic.close();
            } catch (IOException unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle handleNfcF(NfcF nfcF) throws IOException {
        Bundle bundle = new Bundle();
        bundle.putBoolean("success", false);
        bundle.putInt("error", 2);
        try {
            try {
                nfcF.connect();
                Iterator<ISmartCardHandler<NfcF>> it = this.mNfcFHandlerList.iterator();
                if (it.hasNext()) {
                    ISmartCardHandler<NfcF> next = it.next();
                    try {
                        bundle = next.onHandleCard(nfcF);
                        StringBuilder sb = new StringBuilder();
                        sb.append("NfcF is handled by handler:");
                        sb.append(next.getClass());
                        unLockExtraHandlerListLocker();
                        try {
                            nfcF.close();
                        } catch (IOException unused) {
                        }
                        return bundle;
                    } catch (UnProcessableCardException unused2) {
                        unLockExtraHandlerListLocker();
                        try {
                            nfcF.close();
                        } catch (IOException unused3) {
                        }
                        return bundle;
                    }
                }
                lockExtraHandlerListLocker();
                for (ISmartCardHandler<NfcF> iSmartCardHandler : this.mExtraNfcFHandlerList) {
                    try {
                        bundle = iSmartCardHandler.onHandleCard(nfcF);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("NfcF is handled by extra handler:");
                        sb2.append(iSmartCardHandler.getClass());
                        unLockExtraHandlerListLocker();
                        try {
                            nfcF.close();
                        } catch (IOException unused4) {
                        }
                        return bundle;
                    } catch (UnProcessableCardException unused5) {
                    }
                }
                unLockExtraHandlerListLocker();
                try {
                    nfcF.close();
                } catch (IOException unused6) {
                }
                return bundle;
            } catch (InterruptedException unused7) {
                Thread.currentThread().interrupt();
            }
        } catch (Throwable th) {
            unLockExtraHandlerListLocker();
            try {
                nfcF.close();
            } catch (IOException unused8) {
            }
            throw th;
        }
    }

    public void addSmartCardExtraHandler(ISmartCardHandler iSmartCardHandler) {
        int techType = iSmartCardHandler.getTechType();
        if (techType == 1) {
            this.mExtraIsoDepHandlerList.add(iSmartCardHandler);
        } else {
            if (techType != 2) {
                return;
            }
            this.mExtraNfcFHandlerList.add(iSmartCardHandler);
        }
    }

    public void addSmartCardHandler(ISmartCardHandler iSmartCardHandler) {
        int techType = iSmartCardHandler.getTechType();
        if (techType == 1) {
            this.mIsoDepHandlerList.add(iSmartCardHandler);
            return;
        }
        if (techType == 2) {
            this.mNfcFHandlerList.add(iSmartCardHandler);
        } else {
            if (techType == 3) {
                this.mMifareClassicHandlerList.add(iSmartCardHandler);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown card handler: ");
            sb.append(iSmartCardHandler.getClass());
        }
    }

    public void handleTag(final Tag tag) {
        if (this.mStop.get()) {
            return;
        }
        SmartCardReaderListener smartCardReaderListener = this.mListener;
        if (smartCardReaderListener != null) {
            smartCardReaderListener.onStartHandleTag();
        }
        this.mWorkHandler.post(new Runnable() { // from class: com.tsmclient.smartcard.handler.TagReader.1
            @Override // java.lang.Runnable
            public void run() {
                final Bundle bundle = null;
                try {
                    IsoDep isoDep = IsoDep.get(tag);
                    if (isoDep != null) {
                        bundle = TagReader.this.handleIsoDep(isoDep);
                        bundle.putParcelable(CardConstants.KEY_TAG, tag);
                    } else {
                        MifareClassic mifareClassic = MifareClassic.get(tag);
                        if (mifareClassic != null) {
                            bundle = TagReader.this.handleMifareClassic(mifareClassic);
                        } else {
                            NfcF nfcF = NfcF.get(tag);
                            if (nfcF == null) {
                                throw new UnProcessableCardException("SmartCardReaderunsupported card type");
                            }
                            bundle = TagReader.this.handleNfcF(nfcF);
                        }
                    }
                    if (bundle == null) {
                        throw new IOException("SmartCardReaderfailed to handle tag");
                    }
                    final SmartCardReaderListener smartCardReaderListener2 = TagReader.this.mListener;
                    if (smartCardReaderListener2 != null) {
                        TagReader.this.mHandler.post(new Runnable() { // from class: com.tsmclient.smartcard.handler.TagReader.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                smartCardReaderListener2.onCompleteHandle(bundle);
                            }
                        });
                    }
                } catch (UnProcessableCardException unused) {
                    bundle = new Bundle();
                    bundle.putBoolean("success", false);
                    bundle.putInt("error", 2);
                } catch (IOException unused2) {
                    bundle = new Bundle();
                    bundle.putBoolean("success", false);
                    bundle.putInt("error", 1);
                } catch (Exception unused3) {
                }
            }
        });
    }

    public boolean isCardPolling() {
        return this.mPolling;
    }

    public void lockExtraHandlerListLocker() throws InterruptedException {
        this.mExtraHandlerListLocker.lockInterruptibly();
    }

    public void setListener(SmartCardReaderListener smartCardReaderListener) {
        this.mListener = smartCardReaderListener;
    }

    public void shutdown() {
        this.mStop.set(true);
        HandlerThread handlerThread = this.mWorkThread;
        if (handlerThread != null) {
            handlerThread.quit();
            this.mWorkThread.interrupt();
        }
        this.mWorkHandler.removeCallbacksAndMessages(null);
        this.mHandler.removeCallbacksAndMessages(null);
    }

    public void startPoll() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.mActivity);
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            return;
        }
        if (this.mPendingIntent == null) {
            Activity activity = this.mActivity;
            this.mPendingIntent = PendingIntent.getActivity(this.mActivity, 0, new Intent(activity, activity.getClass()).addFlags(536870912), 268435456 | PendingIntentUtils.getMutablePendingIntentFlag());
        }
        try {
            defaultAdapter.enableForegroundDispatch(this.mActivity, this.mPendingIntent, null, null);
        } catch (IllegalStateException unused) {
        }
        this.mPolling = true;
    }

    public void stopPoll() {
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(this.mActivity);
        if (defaultAdapter == null || !this.mPolling) {
            return;
        }
        try {
            defaultAdapter.disableForegroundDispatch(this.mActivity);
        } catch (IllegalStateException unused) {
        }
        this.mPolling = false;
    }

    public void unLockExtraHandlerListLocker() {
        if (this.mExtraHandlerListLocker.isHeldByCurrentThread()) {
            this.mExtraHandlerListLocker.unlock();
        }
    }

    public TagReader(Activity activity, Handler handler, Handler handler2) {
        this.mExtraHandlerListLocker = new ReentrantLock();
        if (handler == null) {
            HandlerThread handlerThread = new HandlerThread("SCHandlerThread");
            this.mWorkThread = handlerThread;
            handlerThread.start();
            handler = new Handler(this.mWorkThread.getLooper());
        }
        handler2 = handler2 == null ? new Handler(Looper.getMainLooper()) : handler2;
        this.mWorkHandler = handler;
        this.mHandler = handler2;
        this.mIsoDepHandlerList = new CopyOnWriteArrayList();
        this.mNfcFHandlerList = new CopyOnWriteArrayList();
        this.mMifareClassicHandlerList = new CopyOnWriteArrayList();
        this.mExtraIsoDepHandlerList = new ArrayList();
        this.mExtraNfcFHandlerList = new ArrayList();
        this.mActivity = activity;
        this.mStop = new AtomicBoolean();
    }
}
