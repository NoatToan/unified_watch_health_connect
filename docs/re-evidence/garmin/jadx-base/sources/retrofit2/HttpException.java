package retrofit2;

import c83.a0;
import java.util.Objects;
import okhttp3.Response;
import org.apache.commons.lang3.StringUtils;

/* JADX INFO: loaded from: classes11.dex */
public class HttpException extends RuntimeException {
    private final int code;
    private final String message;
    private final transient a0<?> response;

    public HttpException(a0<?> a0Var) {
        super(getMessage(a0Var));
        this.code = a0Var.f25745a.code();
        this.message = a0Var.f25745a.message();
        this.response = a0Var;
    }

    private static String getMessage(a0<?> a0Var) {
        Objects.requireNonNull(a0Var, "response == null");
        StringBuilder sb3 = new StringBuilder("HTTP ");
        Response response = a0Var.f25745a;
        sb3.append(response.code());
        sb3.append(StringUtils.SPACE);
        sb3.append(response.message());
        return sb3.toString();
    }

    public int code() {
        return this.code;
    }

    public String message() {
        return this.message;
    }

    public a0<?> response() {
        return this.response;
    }
}
