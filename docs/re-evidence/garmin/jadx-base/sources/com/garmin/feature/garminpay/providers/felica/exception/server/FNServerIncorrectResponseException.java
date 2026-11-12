package com.garmin.feature.garminpay.providers.felica.exception.server;

import d53.w;
import io.reactivex.exceptions.CompositeException;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004J\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\n¨\u0006\u0011"}, d2 = {"Lcom/garmin/feature/garminpay/providers/felica/exception/server/FNServerIncorrectResponseException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "exception", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "isExpectedFNServerError", "", "getFNServerErrorMessage", "isServerInUrgentMaintenance", "needToDelete", "needToRefundAndCallCenter", "needToDeleteAndCallCenter", "needCallCenter", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FNServerIncorrectResponseException extends Exception {
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FNServerIncorrectResponseException(String str, Throwable th3) {
        super(str, th3);
        str.getClass();
        th3.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    public final String getFNServerErrorMessage() {
        String rawResultMessage;
        Object next;
        if (isExpectedFNServerError()) {
            Throwable cause = getCause();
            if (cause instanceof FNValidateException) {
                rawResultMessage = ((FNValidateException) cause).getRawResultMessage();
                if (rawResultMessage == null) {
                    rawResultMessage = "";
                }
            } else if (cause instanceof CompositeException) {
                List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
                exceptions.getClass();
                Iterator<T> it = exceptions.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Throwable) next) instanceof FNValidateException));
                FNValidateException fNValidateException = next instanceof FNValidateException ? (FNValidateException) next : null;
                if (fNValidateException == null || (rawResultMessage = fNValidateException.getRawResultMessage()) == null) {
                    rawResultMessage = "";
                }
            } else {
                rawResultMessage = "";
            }
        } else {
            rawResultMessage = "";
        }
        if (rawResultMessage.length() <= 0) {
            return rawResultMessage;
        }
        List listW = w.W(rawResultMessage, new String[]{"_"});
        return listW.size() == 2 ? (String) listW.get(1) : "";
    }

    public final boolean isExpectedFNServerError() {
        Throwable cause = getCause();
        if (cause instanceof FNValidateException) {
            return ((FNValidateException) cause).isExpectedError();
        }
        if (cause instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
            exceptions.getClass();
            if (exceptions.isEmpty()) {
                return false;
            }
            for (Throwable th3 : exceptions) {
                if ((th3 instanceof FNValidateException) && ((FNValidateException) th3).isExpectedError()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean isServerInUrgentMaintenance() {
        Throwable cause = getCause();
        if (cause instanceof ServerInUrgentMaintenanceException) {
            return true;
        }
        if (cause instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
            exceptions.getClass();
            if (exceptions.isEmpty()) {
                return false;
            }
            Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof ServerInUrgentMaintenanceException) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean needCallCenter() {
        Throwable cause = getCause();
        if (cause instanceof NeedCallCenterException) {
            return true;
        }
        if (cause instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
            exceptions.getClass();
            if (exceptions.isEmpty()) {
                return false;
            }
            Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof NeedCallCenterException) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean needToDelete() {
        Throwable cause = getCause();
        if (cause instanceof NeedDeleteException) {
            return true;
        }
        if (cause instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
            exceptions.getClass();
            if (exceptions.isEmpty()) {
                return false;
            }
            Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof NeedDeleteException) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean needToDeleteAndCallCenter() {
        Throwable cause = getCause();
        if (cause instanceof NeedDeleteAndCallCenterException) {
            return true;
        }
        if (cause instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
            exceptions.getClass();
            if (exceptions.isEmpty()) {
                return false;
            }
            Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof NeedDeleteAndCallCenterException) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean needToRefundAndCallCenter() {
        Throwable cause = getCause();
        if (cause instanceof NeedRefundAndCallCenterException) {
            return true;
        }
        if (cause instanceof CompositeException) {
            List<Throwable> exceptions = ((CompositeException) cause).getExceptions();
            exceptions.getClass();
            if (exceptions.isEmpty()) {
                return false;
            }
            Iterator<T> it = exceptions.iterator();
            while (it.hasNext()) {
                if (((Throwable) it.next()) instanceof NeedRefundAndCallCenterException) {
                    return true;
                }
            }
        }
        return false;
    }
}
