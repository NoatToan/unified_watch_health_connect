package com.miui.tsmclient.smartcard.terminal;

import android.os.Parcel;
import android.os.Parcelable;
import com.tsmclient.smartcard.exception.NfcEeIOException;
import java.io.IOException;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes6.dex */
public class SmartMxError implements Parcelable {
    private static final Class[] ALLOWED_EXCEPTIONS = {NfcEeIOException.class, IOException.class, InterruptedException.class, SecurityException.class, NoSuchElementException.class, IllegalStateException.class, IllegalArgumentException.class, UnsupportedOperationException.class, NullPointerException.class};
    public static final Parcelable.Creator<SmartMxError> CREATOR = new Parcelable.Creator<SmartMxError>() { // from class: com.miui.tsmclient.smartcard.terminal.SmartMxError.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmartMxError createFromParcel(Parcel parcel) {
            return new SmartMxError(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SmartMxError[] newArray(int i) {
            return new SmartMxError[i];
        }
    };
    private String mClazz;
    private int mErrorCode;
    private String mMessage;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.mClazz = parcel.readString();
        this.mMessage = parcel.readString();
        this.mErrorCode = parcel.readInt();
    }

    public void set(Exception exc) throws IllegalArgumentException {
        if (exc == null) {
            throw new IllegalArgumentException("Cannot set a null exception");
        }
        Class<?> cls = exc.getClass();
        if (Arrays.asList(ALLOWED_EXCEPTIONS).contains(cls)) {
            this.mClazz = cls.getCanonicalName();
            this.mMessage = exc.getMessage() != null ? exc.getMessage() : "";
        } else {
            throw new IllegalArgumentException("Unexpected exception class: " + cls.getCanonicalName());
        }
    }

    public void setError(Class cls, String str) {
        this.mClazz = cls == null ? "" : cls.getName();
        if (str == null) {
            str = "";
        }
        this.mMessage = str;
    }

    public void throwException() throws IllegalStateException, UnsupportedOperationException, InterruptedException, IOException, SecurityException, NoSuchElementException, IllegalArgumentException, NullPointerException {
        if (this.mClazz.equals(NfcEeIOException.class.getCanonicalName())) {
            throw new NfcEeIOException(this.mMessage, this.mErrorCode);
        }
        if (this.mClazz.equals(IOException.class.getCanonicalName())) {
            throw new IOException(this.mMessage);
        }
        if (this.mClazz.equals(InterruptedException.class.getCanonicalName())) {
            throw new InterruptedException(this.mMessage);
        }
        if (this.mClazz.equals(SecurityException.class.getCanonicalName())) {
            throw new SecurityException(this.mMessage);
        }
        if (this.mClazz.equals(AccessControlException.class.getCanonicalName())) {
            throw new SecurityException(this.mMessage);
        }
        if (this.mClazz.equals(NoSuchElementException.class.getCanonicalName())) {
            throw new NoSuchElementException(this.mMessage);
        }
        if (this.mClazz.equals(IllegalStateException.class.getCanonicalName())) {
            throw new IllegalStateException(this.mMessage);
        }
        if (this.mClazz.equals(IllegalArgumentException.class.getCanonicalName())) {
            throw new IllegalArgumentException(this.mMessage);
        }
        if (this.mClazz.equals(UnsupportedOperationException.class.getCanonicalName())) {
            throw new UnsupportedOperationException(this.mMessage);
        }
        if (this.mClazz.equals(NullPointerException.class.getCanonicalName())) {
            throw new NullPointerException(this.mMessage);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mClazz);
        parcel.writeString(this.mMessage);
        parcel.writeInt(this.mErrorCode);
    }

    public SmartMxError() {
        this.mClazz = "";
        this.mMessage = "";
    }

    private SmartMxError(Parcel parcel) {
        readFromParcel(parcel);
    }
}
