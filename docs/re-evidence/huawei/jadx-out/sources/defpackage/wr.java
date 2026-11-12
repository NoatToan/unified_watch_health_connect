package defpackage;

import com.fasterxml.jackson.core.JacksonException;

/* JADX INFO: loaded from: classes21.dex */
public class wr extends JacksonException {
    private static final long serialVersionUID = 123;
    protected wq _location;

    protected String getMessageSuffix() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public Object getProcessor() {
        return null;
    }

    public wr(String str, wq wqVar, Throwable th) {
        super(str, th);
        this._location = wqVar;
    }

    public wr(String str) {
        super(str);
    }

    public wr(String str, wq wqVar) {
        this(str, wqVar, null);
    }

    protected wr(String str, Throwable th) {
        this(str, null, th);
    }

    protected wr(Throwable th) {
        this(null, null, th);
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public wq getLocation() {
        return this._location;
    }

    public void clearLocation() {
        this._location = null;
    }

    @Override // com.fasterxml.jackson.core.JacksonException
    public String getOriginalMessage() {
        return super.getMessage();
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String message = super.getMessage();
        if (message == null) {
            message = "N/A";
        }
        wq location = getLocation();
        String messageSuffix = getMessageSuffix();
        if (location == null && messageSuffix == null) {
            return message;
        }
        StringBuilder sb = new StringBuilder(100);
        sb.append(message);
        if (messageSuffix != null) {
            sb.append(messageSuffix);
        }
        if (location != null) {
            sb.append("\n at ");
            sb.append(location.toString());
        }
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return getClass().getName() + ": " + getMessage();
    }
}
