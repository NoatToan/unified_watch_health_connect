package org.apache.commons.fileupload;

import com.amazon.alexa.avs.http.HttpHeaders;
import com.liulishuo.filedownloader.model.FileDownloadModel;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.servlet.ServletRequestContext;
import org.apache.commons.fileupload.util.Closeable;
import org.apache.commons.fileupload.util.FileItemHeadersImpl;
import org.apache.commons.fileupload.util.LimitedInputStream;
import org.apache.commons.fileupload.util.Streams;

/* JADX INFO: loaded from: classes23.dex */
public abstract class FileUploadBase {
    public static final String ATTACHMENT = "attachment";
    public static final String CONTENT_DISPOSITION = "Content-disposition";
    public static final String CONTENT_LENGTH = "Content-length";
    public static final String CONTENT_TYPE = "Content-type";
    public static final String FORM_DATA = "form-data";

    @Deprecated
    public static final int MAX_HEADER_SIZE = 1024;
    public static final String MULTIPART = "multipart/";
    public static final String MULTIPART_FORM_DATA = "multipart/form-data";
    public static final String MULTIPART_MIXED = "multipart/mixed";
    private long a = -1;
    private long b = -1;
    private String c;
    private ProgressListener d;

    public static class FileSizeLimitExceededException extends SizeException {
        private static final long serialVersionUID = 8150776562029630058L;
        private String d;
        private String e;

        public FileSizeLimitExceededException(String str, long j, long j2) {
            super(str, j, j2);
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getActualSize() {
            return super.getActualSize();
        }

        public String getFieldName() {
            return this.e;
        }

        public String getFileName() {
            return this.d;
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getPermittedSize() {
            return super.getPermittedSize();
        }

        public void setFieldName(String str) {
            this.e = str;
        }

        public void setFileName(String str) {
            this.d = str;
        }
    }

    public static class FileUploadIOException extends IOException {
        private static final long serialVersionUID = -7047616958165584154L;
        private final FileUploadException a;

        public FileUploadIOException(FileUploadException fileUploadException) {
            this.a = fileUploadException;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.a;
        }
    }

    public static class IOFileUploadException extends FileUploadException {
        private static final long serialVersionUID = 1749796615868477269L;
        private final IOException b;

        public IOFileUploadException(String str, IOException iOException) {
            super(str);
            this.b = iOException;
        }

        @Override // org.apache.commons.fileupload.FileUploadException, java.lang.Throwable
        public Throwable getCause() {
            return this.b;
        }
    }

    public static class InvalidContentTypeException extends FileUploadException {
        private static final long serialVersionUID = -9073026332015646668L;

        public InvalidContentTypeException() {
        }

        public InvalidContentTypeException(String str) {
            super(str);
        }

        public InvalidContentTypeException(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class SizeException extends FileUploadException {
        private static final long serialVersionUID = -8776225574705254126L;
        private final long b;
        private final long c;

        public SizeException(String str, long j, long j2) {
            super(str);
            this.b = j;
            this.c = j2;
        }

        public long getActualSize() {
            return this.b;
        }

        public long getPermittedSize() {
            return this.c;
        }
    }

    public static class SizeLimitExceededException extends SizeException {
        private static final long serialVersionUID = -2474893167098052828L;

        @Deprecated
        public SizeLimitExceededException() {
            this(null, 0L, 0L);
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getActualSize() {
            return super.getActualSize();
        }

        @Override // org.apache.commons.fileupload.FileUploadBase.SizeException
        public /* bridge */ /* synthetic */ long getPermittedSize() {
            return super.getPermittedSize();
        }

        @Deprecated
        public SizeLimitExceededException(String str) {
            this(str, 0L, 0L);
        }

        public SizeLimitExceededException(String str, long j, long j2) {
            super(str, j, j2);
        }
    }

    @Deprecated
    public static class UnknownSizeException extends FileUploadException {
        private static final long serialVersionUID = 7062279004812015273L;

        public UnknownSizeException() {
        }

        public UnknownSizeException(String str) {
            super(str);
        }
    }

    public class a implements FileItemIterator {
        private final MultipartStream a;
        private final MultipartStream.ProgressNotifier b;
        private final byte[] c;
        private b d;
        private String e;
        private boolean f;
        private boolean g;
        private boolean h;

        /* JADX INFO: renamed from: org.apache.commons.fileupload.FileUploadBase$a$a, reason: collision with other inner class name */
        public class C1193a extends LimitedInputStream {
            public final /* synthetic */ FileUploadBase d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1193a(InputStream inputStream, long j, FileUploadBase fileUploadBase) {
                super(inputStream, j);
                this.d = fileUploadBase;
            }

            @Override // org.apache.commons.fileupload.util.LimitedInputStream
            public void raiseError(long j, long j2) throws IOException {
                throw new FileUploadIOException(new SizeLimitExceededException(String.format("the request was rejected because its size (%s) exceeds the configured maximum (%s)", Long.valueOf(j2), Long.valueOf(j)), j2, j));
            }
        }

        public class b implements FileItemStream {
            private final String a;
            private final String b;
            private final String c;
            private final boolean d;
            private final InputStream e;
            private boolean f;
            private FileItemHeaders g;

            /* JADX INFO: renamed from: org.apache.commons.fileupload.FileUploadBase$a$b$a, reason: collision with other inner class name */
            public class C1194a extends LimitedInputStream {
                public final /* synthetic */ a d;
                public final /* synthetic */ MultipartStream.ItemInputStream e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1194a(InputStream inputStream, long j, a aVar, MultipartStream.ItemInputStream itemInputStream) {
                    super(inputStream, j);
                    this.d = aVar;
                    this.e = itemInputStream;
                }

                @Override // org.apache.commons.fileupload.util.LimitedInputStream
                public void raiseError(long j, long j2) throws IOException {
                    this.e.close(true);
                    FileSizeLimitExceededException fileSizeLimitExceededException = new FileSizeLimitExceededException(String.format("The field %s exceeds its maximum permitted size of %s bytes.", b.this.b, Long.valueOf(j)), j2, j);
                    fileSizeLimitExceededException.setFieldName(b.this.b);
                    fileSizeLimitExceededException.setFileName(b.this.c);
                    throw new FileUploadIOException(fileSizeLimitExceededException);
                }
            }

            public b(String str, String str2, String str3, boolean z, long j) throws IOException {
                this.c = str;
                this.b = str2;
                this.a = str3;
                this.d = z;
                MultipartStream.ItemInputStream itemInputStreamK = a.this.a.k();
                InputStream c1194a = itemInputStreamK;
                if (FileUploadBase.this.b != -1) {
                    if (j != -1 && j > FileUploadBase.this.b) {
                        FileSizeLimitExceededException fileSizeLimitExceededException = new FileSizeLimitExceededException(String.format("The field %s exceeds its maximum permitted size of %s bytes.", str2, Long.valueOf(FileUploadBase.this.b)), j, FileUploadBase.this.b);
                        fileSizeLimitExceededException.setFileName(str);
                        fileSizeLimitExceededException.setFieldName(str2);
                        throw new FileUploadIOException(fileSizeLimitExceededException);
                    }
                    c1194a = new C1194a(itemInputStreamK, FileUploadBase.this.b, a.this, itemInputStreamK);
                }
                this.e = c1194a;
            }

            public void c() throws IOException {
                this.e.close();
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public String getContentType() {
                return this.a;
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public String getFieldName() {
                return this.b;
            }

            @Override // org.apache.commons.fileupload.FileItemHeadersSupport
            public FileItemHeaders getHeaders() {
                return this.g;
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public String getName() {
                return Streams.checkFileName(this.c);
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public boolean isFormField() {
                return this.d;
            }

            @Override // org.apache.commons.fileupload.FileItemStream
            public InputStream openStream() throws IOException {
                if (this.f) {
                    throw new IllegalStateException("The stream was already opened.");
                }
                if (((Closeable) this.e).isClosed()) {
                    throw new FileItemStream.ItemSkippedException();
                }
                return this.e;
            }

            @Override // org.apache.commons.fileupload.FileItemHeadersSupport
            public void setHeaders(FileItemHeaders fileItemHeaders) {
                this.g = fileItemHeaders;
            }
        }

        public a(RequestContext requestContext) throws IOException, FileUploadException {
            Objects.requireNonNull(requestContext, "ctx parameter");
            String contentType = requestContext.getContentType();
            if (contentType == null || !contentType.toLowerCase(Locale.ENGLISH).startsWith(FileUploadBase.MULTIPART)) {
                throw new InvalidContentTypeException(String.format("the request doesn't contain a %s or %s stream, content type header is %s", "multipart/form-data", FileUploadBase.MULTIPART_MIXED, contentType));
            }
            InputStream inputStream = requestContext.getInputStream();
            long jContentLength = UploadContext.class.isAssignableFrom(requestContext.getClass()) ? ((UploadContext) requestContext).contentLength() : requestContext.getContentLength();
            if (FileUploadBase.this.a >= 0) {
                if (jContentLength != -1 && jContentLength > FileUploadBase.this.a) {
                    throw new SizeLimitExceededException(String.format("the request was rejected because its size (%s) exceeds the configured maximum (%s)", Long.valueOf(jContentLength), Long.valueOf(FileUploadBase.this.a)), jContentLength, FileUploadBase.this.a);
                }
                inputStream = new C1193a(inputStream, FileUploadBase.this.a, FileUploadBase.this);
            }
            String characterEncoding = FileUploadBase.this.c;
            characterEncoding = characterEncoding == null ? requestContext.getCharacterEncoding() : characterEncoding;
            byte[] boundary = FileUploadBase.this.getBoundary(contentType);
            this.c = boundary;
            if (boundary == null) {
                throw new FileUploadException("the request was rejected because no multipart boundary was found");
            }
            MultipartStream.ProgressNotifier progressNotifier = new MultipartStream.ProgressNotifier(FileUploadBase.this.d, jContentLength);
            this.b = progressNotifier;
            try {
                MultipartStream multipartStream = new MultipartStream(inputStream, boundary, progressNotifier);
                this.a = multipartStream;
                multipartStream.setHeaderEncoding(characterEncoding);
                this.f = true;
                b();
            } catch (IllegalArgumentException e) {
                throw new InvalidContentTypeException(String.format("The boundary specified in the %s header is too long", FileUploadBase.CONTENT_TYPE), e);
            }
        }

        private boolean b() throws IOException {
            if (this.h) {
                return false;
            }
            b bVar = this.d;
            if (bVar != null) {
                bVar.c();
                this.d = null;
            }
            while (true) {
                if (this.f ? this.a.skipPreamble() : this.a.readBoundary()) {
                    FileItemHeaders parsedHeaders = FileUploadBase.this.getParsedHeaders(this.a.readHeaders());
                    if (this.e == null) {
                        String fieldName = FileUploadBase.this.getFieldName(parsedHeaders);
                        if (fieldName != null) {
                            String header = parsedHeaders.getHeader(FileUploadBase.CONTENT_TYPE);
                            if (header == null || !header.toLowerCase(Locale.ENGLISH).startsWith(FileUploadBase.MULTIPART_MIXED)) {
                                String fileName = FileUploadBase.this.getFileName(parsedHeaders);
                                b bVar2 = new b(fileName, fieldName, parsedHeaders.getHeader(FileUploadBase.CONTENT_TYPE), fileName == null, c(parsedHeaders));
                                this.d = bVar2;
                                bVar2.setHeaders(parsedHeaders);
                                this.b.b();
                                this.g = true;
                                return true;
                            }
                            this.e = fieldName;
                            this.a.setBoundary(FileUploadBase.this.getBoundary(header));
                            this.f = true;
                        }
                    } else {
                        String fileName2 = FileUploadBase.this.getFileName(parsedHeaders);
                        if (fileName2 != null) {
                            b bVar3 = new b(fileName2, this.e, parsedHeaders.getHeader(FileUploadBase.CONTENT_TYPE), false, c(parsedHeaders));
                            this.d = bVar3;
                            bVar3.setHeaders(parsedHeaders);
                            this.b.b();
                            this.g = true;
                            return true;
                        }
                    }
                    this.a.discardBodyData();
                } else {
                    if (this.e == null) {
                        this.h = true;
                        return false;
                    }
                    this.a.setBoundary(this.c);
                    this.e = null;
                }
            }
        }

        private long c(FileItemHeaders fileItemHeaders) {
            try {
                return Long.parseLong(fileItemHeaders.getHeader(FileUploadBase.CONTENT_LENGTH));
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // org.apache.commons.fileupload.FileItemIterator
        public boolean hasNext() throws FileUploadException, IOException {
            if (this.h) {
                return false;
            }
            if (this.g) {
                return true;
            }
            try {
                return b();
            } catch (FileUploadIOException e) {
                throw ((FileUploadException) e.getCause());
            }
        }

        @Override // org.apache.commons.fileupload.FileItemIterator
        public FileItemStream next() throws FileUploadException, IOException {
            if (this.h || !(this.g || hasNext())) {
                throw new NoSuchElementException();
            }
            this.g = false;
            return this.d;
        }
    }

    private String e(String str) {
        if (str == null || !str.toLowerCase(Locale.ENGLISH).startsWith(FORM_DATA)) {
            return null;
        }
        ParameterParser parameterParser = new ParameterParser();
        parameterParser.setLowerCaseNames(true);
        String str2 = parameterParser.parse(str, ';').get("name");
        return str2 != null ? str2.trim() : str2;
    }

    private String f(String str) {
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.startsWith(FORM_DATA) || lowerCase.startsWith("attachment")) {
                ParameterParser parameterParser = new ParameterParser();
                parameterParser.setLowerCaseNames(true);
                Map<String, String> map = parameterParser.parse(str, ';');
                if (map.containsKey(FileDownloadModel.FILENAME)) {
                    String str2 = map.get(FileDownloadModel.FILENAME);
                    return str2 != null ? str2.trim() : "";
                }
            }
        }
        return null;
    }

    private int g(String str, int i) {
        int i2;
        while (true) {
            int iIndexOf = str.indexOf(13, i);
            if (iIndexOf == -1 || (i2 = iIndexOf + 1) >= str.length()) {
                break;
            }
            if (str.charAt(i2) == '\n') {
                return iIndexOf;
            }
            i = i2;
        }
        throw new IllegalStateException("Expected headers to be terminated by an empty line.");
    }

    private void h(FileItemHeadersImpl fileItemHeadersImpl, String str) {
        int iIndexOf = str.indexOf(58);
        if (iIndexOf == -1) {
            return;
        }
        fileItemHeadersImpl.addHeader(str.substring(0, iIndexOf).trim(), str.substring(str.indexOf(58) + 1).trim());
    }

    public static final boolean isMultipartContent(RequestContext requestContext) {
        String contentType = requestContext.getContentType();
        return contentType != null && contentType.toLowerCase(Locale.ENGLISH).startsWith(MULTIPART);
    }

    @Deprecated
    public FileItem createItem(Map<String, String> map, boolean z) throws FileUploadException {
        return getFileItemFactory().createItem(getFieldName(map), getHeader(map, CONTENT_TYPE), z, getFileName(map));
    }

    public byte[] getBoundary(String str) {
        ParameterParser parameterParser = new ParameterParser();
        parameterParser.setLowerCaseNames(true);
        String str2 = parameterParser.parse(str, new char[]{';', ','}).get(HttpHeaders.Parameters.BOUNDARY);
        if (str2 == null) {
            return null;
        }
        try {
            return str2.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException unused) {
            return str2.getBytes();
        }
    }

    public String getFieldName(FileItemHeaders fileItemHeaders) {
        return e(fileItemHeaders.getHeader(CONTENT_DISPOSITION));
    }

    public abstract FileItemFactory getFileItemFactory();

    @Deprecated
    public String getFileName(Map<String, String> map) {
        return f(getHeader(map, CONTENT_DISPOSITION));
    }

    public long getFileSizeMax() {
        return this.b;
    }

    @Deprecated
    public final String getHeader(Map<String, String> map, String str) {
        return map.get(str.toLowerCase(Locale.ENGLISH));
    }

    public String getHeaderEncoding() {
        return this.c;
    }

    public FileItemIterator getItemIterator(RequestContext requestContext) throws FileUploadException, IOException {
        try {
            return new a(requestContext);
        } catch (FileUploadIOException e) {
            throw ((FileUploadException) e.getCause());
        }
    }

    public FileItemHeaders getParsedHeaders(String str) {
        int length = str.length();
        FileItemHeadersImpl fileItemHeadersImplNewFileItemHeaders = newFileItemHeaders();
        int i = 0;
        while (true) {
            int iG = g(str, i);
            if (i == iG) {
                return fileItemHeadersImplNewFileItemHeaders;
            }
            StringBuilder sb = new StringBuilder(str.substring(i, iG));
            i = iG + 2;
            while (i < length) {
                int i2 = i;
                while (i2 < length) {
                    char cCharAt = str.charAt(i2);
                    if (cCharAt != ' ' && cCharAt != '\t') {
                        break;
                    }
                    i2++;
                }
                if (i2 == i) {
                    break;
                }
                int iG2 = g(str, i2);
                sb.append(" ");
                sb.append(str.substring(i2, iG2));
                i = iG2 + 2;
            }
            h(fileItemHeadersImplNewFileItemHeaders, sb.toString());
        }
    }

    public ProgressListener getProgressListener() {
        return this.d;
    }

    public long getSizeMax() {
        return this.a;
    }

    public FileItemHeadersImpl newFileItemHeaders() {
        return new FileItemHeadersImpl();
    }

    @Deprecated
    public Map<String, String> parseHeaders(String str) {
        FileItemHeaders parsedHeaders = getParsedHeaders(str);
        HashMap map = new HashMap();
        Iterator<String> headerNames = parsedHeaders.getHeaderNames();
        while (headerNames.hasNext()) {
            String next = headerNames.next();
            Iterator<String> headers = parsedHeaders.getHeaders(next);
            StringBuilder sb = new StringBuilder(headers.next());
            while (headers.hasNext()) {
                sb.append(",");
                sb.append(headers.next());
            }
            map.put(next, sb.toString());
        }
        return map;
    }

    public Map<String, List<FileItem>> parseParameterMap(RequestContext requestContext) throws FileUploadException {
        List<FileItem> request = parseRequest(requestContext);
        HashMap map = new HashMap(request.size());
        for (FileItem fileItem : request) {
            String fieldName = fileItem.getFieldName();
            List arrayList = (List) map.get(fieldName);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(fieldName, arrayList);
            }
            arrayList.add(fileItem);
        }
        return map;
    }

    @Deprecated
    public List<FileItem> parseRequest(HttpServletRequest httpServletRequest) throws FileUploadException {
        return parseRequest(new ServletRequestContext(httpServletRequest));
    }

    public abstract void setFileItemFactory(FileItemFactory fileItemFactory);

    public void setFileSizeMax(long j) {
        this.b = j;
    }

    public void setHeaderEncoding(String str) {
        this.c = str;
    }

    public void setProgressListener(ProgressListener progressListener) {
        this.d = progressListener;
    }

    public void setSizeMax(long j) {
        this.a = j;
    }

    @Deprecated
    public String getFieldName(Map<String, String> map) {
        return e(getHeader(map, CONTENT_DISPOSITION));
    }

    public String getFileName(FileItemHeaders fileItemHeaders) {
        return f(fileItemHeaders.getHeader(CONTENT_DISPOSITION));
    }

    public List<FileItem> parseRequest(RequestContext requestContext) throws FileUploadException {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                FileItemIterator itemIterator = getItemIterator(requestContext);
                FileItemFactory fileItemFactory = getFileItemFactory();
                if (fileItemFactory == null) {
                    throw new NullPointerException("No FileItemFactory has been set.");
                }
                while (itemIterator.hasNext()) {
                    FileItemStream next = itemIterator.next();
                    FileItem fileItemCreateItem = fileItemFactory.createItem(next.getFieldName(), next.getContentType(), next.isFormField(), ((a.b) next).c);
                    arrayList.add(fileItemCreateItem);
                    try {
                        Streams.copy(next.openStream(), fileItemCreateItem.getOutputStream(), true);
                        fileItemCreateItem.setHeaders(next.getHeaders());
                    } catch (FileUploadIOException e) {
                        throw ((FileUploadException) e.getCause());
                    } catch (IOException e2) {
                        throw new IOFileUploadException(String.format("Processing of %s request failed. %s", "multipart/form-data", e2.getMessage()), e2);
                    }
                }
                return arrayList;
            } catch (Throwable th) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    try {
                        ((FileItem) it2.next()).delete();
                    } catch (Throwable unused) {
                    }
                }
                throw th;
            }
        } catch (FileUploadIOException e3) {
            throw ((FileUploadException) e3.getCause());
        } catch (IOException e4) {
            throw new FileUploadException(e4.getMessage(), e4);
        }
    }

    @Deprecated
    public static boolean isMultipartContent(HttpServletRequest httpServletRequest) {
        return ServletFileUpload.isMultipartContent(httpServletRequest);
    }
}
