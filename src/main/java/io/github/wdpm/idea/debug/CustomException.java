package io.github.wdpm.idea.debug;

/**
 * 自定义异常
 *
 * @author evan
 * @date 2020/4/20
 */
public class CustomException extends RuntimeException {
    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }
}
