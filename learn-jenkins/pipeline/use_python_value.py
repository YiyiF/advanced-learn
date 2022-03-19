import sys

def test_value():
    # print('Running func test_value')
    return 2


if __name__ == '__main__':
    print('{} Value: {}'.format('Running', 'Call python'))
    sys.stdout.write('Value stdout: %s\n' % 2)
    # test_value()